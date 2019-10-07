package hack19.hero.regionalization.service;

import hack19.hero.regionalization.model.*;
import hack19.hero.regionalization.util.HeroContentFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Map;

@Singleton
public class HeroMapFactory {

    @Inject
    private AccountInfoService      accountInfoService;
    @Inject
    private AccountContentService accountContentService;

    // Receive   account info
    // Determine zone
    // Determine region
    // Determine national basis
    // Determine custom config
    // Determine priority
    // Match priority with account information to determine what hero content is the best
    public HeroContent determineHeroContent(String accountId){

        AccountInfo accountInfo =
                accountInfoService.determineAccountInfo(accountId);

        OEMContentPriority  oemContentPriority  =
                accountContentService.determineOemPriority(accountInfo.getOemId());

        OEMContentMap oemContentMap  =
                accountContentService.determineOemContentMap(accountInfo.getOemId());

        return findHeroContentForAccount(accountInfo,
                oemContentPriority,
                oemContentMap);
    }

    private HeroContent findHeroContentForAccount(AccountInfo accountInfo,
                                                            OEMContentPriority oemContentPriority,
                                                            OEMContentMap oemContentMap) {
        Map<String, String> heroContentMap = null;

        //Iterate through priority hierarchy
        //Fetch hero content for priority
        //Return hero content if not null
        //Otherwise, keep iterating
        //If there's no hero content available, return the default for OEM
        for (String priority:
                oemContentPriority.getPriorityList()) {
            heroContentMap =   HeroContentFactory.lookupHeroContentInMap(priority, accountInfo, oemContentMap);
            if(heroContentMap  !=  null){
                break;
            }
        }
        HeroContent heroContent =   asHeroContent(heroContentMap, oemContentMap);
        //TODO: fix the default object thing
        return heroContent;
    }

    private HeroContent asHeroContent(Map<String, String> heroContentMap,
                                      OEMContentMap oemContentMap) {
        if(heroContentMap == null){
            Map<String, String> defaultMap =
                    oemContentMap.getDefaultHeroContent().get("default");

            return new HeroContent()
                    .withImageUrl(defaultMap.get("imageUrl"))
                    .withText(defaultMap.get("text"))
                    .withUrl(defaultMap.get("url"));

        }
        return new HeroContent()
                .withImageUrl(heroContentMap.get("imageUrl"))
                .withText(heroContentMap.get("text"))
                .withUrl(heroContentMap.get("url"));
    }


}
