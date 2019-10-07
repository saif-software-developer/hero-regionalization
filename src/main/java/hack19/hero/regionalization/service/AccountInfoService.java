package hack19.hero.regionalization.service;

import hack19.hero.regionalization.model.AccountInfo;

import javax.inject.Singleton;

@Singleton
public class AccountInfoService {

    public AccountInfo determineAccountInfo(String accountId){
        String  oemId           =   determineOEMIdForAccount(accountId);
        String  accountZone     =   determineZoneForAccount(accountId);
        String  accountRegion   =   determineRegionForAccount(accountId);
        String  nationalBasis   =   determineNationalBasis(accountId);
        String  customConfig    =   determineCustomConfigIfAny(accountId);

        return new AccountInfo(oemId, accountZone, accountRegion,nationalBasis,customConfig);
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    private String determineOEMIdForAccount(String accountId) { return "lincoln";}

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    private String determineZoneForAccount(String accountId) {
        return "A";
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    private String determineRegionForAccount(String accountId) {
        return "southwest";
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    private String determineNationalBasis(String accountId) {
        return "Not Implemented";
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    private String determineCustomConfigIfAny(String accountId) {
        return "BlackLabel";
    }
}
