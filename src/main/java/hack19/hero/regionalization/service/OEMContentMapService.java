package hack19.hero.regionalization.service;

import hack19.hero.regionalization.model.HeroContent;
import hack19.hero.regionalization.model.OEMContentMap;
import hack19.hero.regionalization.model.OEMContentPriority;
import hack19.hero.regionalization.repository.AccountContentRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class OEMContentMapService {
    @Inject
    private AccountContentRepository accountContentRepository;
    @Inject
    private HeroMapService heroMapService;



    public OEMContentMap findHeroContentMapForOemId(String oemId) {
        return accountContentRepository.findOEMContentMap(oemId);
    }

    public OEMContentPriority findOEMContentPriorityForOemId(String oemId) {
        return accountContentRepository.findOEMContentPriority(oemId);
    }

    public HeroContent findHeroContentForAccountId(String accountId) {
        return heroMapService.determineHeroContent(accountId);
    }
}
