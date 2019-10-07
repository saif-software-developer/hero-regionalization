package hack19.hero.regionalization.controller;

import hack19.hero.regionalization.model.HeroContent;
import hack19.hero.regionalization.model.OEMContentMap;
import hack19.hero.regionalization.model.OEMContentPriority;
import hack19.hero.regionalization.service.OEMContentMapService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/hero-regional")
public class HeroContentController {

    @Inject
    private OEMContentMapService oemContentMapService;

    @Get("/findHeroContentMapForOemId/{oemId}")
    public OEMContentMap findHeroContentMapForOemId(String oemId){
        return oemContentMapService.findHeroContentMapForOemId(oemId);
    }

    @Get("/findOEMContentPriorityForOemId/{oemId}")
    public OEMContentPriority findOEMContentPriorityForOemId(String oemId){
        return oemContentMapService.findOEMContentPriorityForOemId(oemId);
    }

    @Get("/findHeroContentForAccountId/{accountId}")
    public HeroContent findHeroContentForAccountId(String accountId){
        return oemContentMapService.findHeroContentForAccountId(accountId);
    }
}
