package hack19.hero.regionalization.service;

import hack19.hero.regionalization.model.OEMContentMap;
import hack19.hero.regionalization.model.OEMContentPriority;
import hack19.hero.regionalization.repository.AccountContentRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AccountContentService {

    @Inject
    AccountContentRepository accountContentRepository;

    public OEMContentPriority determineOemPriority(String oemId) {
        return  accountContentRepository.findOEMContentPriority(oemId);
    }

    public OEMContentMap determineOemContentMap(String oemId) {
        return accountContentRepository.findOEMContentMap(oemId);
    }
}
