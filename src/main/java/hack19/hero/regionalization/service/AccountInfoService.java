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
     * TODO: Figure out how to find the oem associated with the accountId
     * TODO: Figure out how to find the zone associated with accountId
     * TODO: Figure ouw to find the region associated with accountId
     * TODO: NationalBase should be something attached to oem
     * I assume that custom config would be determined based on
     * 1) Config table AccountCustomConfig
     * 2) Flag that we read from the oem feed
     * 3) Preference passed to the widget
     *
     */


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
