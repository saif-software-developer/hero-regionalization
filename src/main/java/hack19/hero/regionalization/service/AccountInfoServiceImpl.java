package hack19.hero.regionalization.service;

import hack19.hero.regionalization.util.AccountInfoLookupFactory;
import hack19.hero.regionalization.model.AccountInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AccountInfoServiceImpl
    implements AccountInfoServiceInterface {

    @Inject
    private AccountInfoLookupFactory accountInfoLookupFactory;

    public AccountInfo determineAccountInfo(String accountId){
        String  oemId           =   determineOEMIdForAccount(accountId);
        String  accountZone     =   determineZoneForAccount(oemId, accountId);
        String  accountRegion   =   determineRegionForAccount(oemId, accountId);
        String  nationalBasis   =   determineNationalBasis(oemId, accountId);
        String  customConfig    =   determineCustomConfigIfAny(oemId, accountId);

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
    public String determineOEMIdForAccount(String accountId) {
        return  accountInfoLookupFactory
                .getAccountInfoLookupInstance(accountId)
                .determineOEMIdForAccount(accountId);
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    public String determineZoneForAccount(String oemId, String accountId){
         return  accountInfoLookupFactory
                 .getAccountInfoLookupInstance(oemId)
                 .determineZoneForAccount(accountId);
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    public String determineRegionForAccount(String oemId, String accountId) {
        return  accountInfoLookupFactory
                .getAccountInfoLookupInstance(oemId)
                .determineRegionForAccount(accountId);
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    public String determineNationalBasis(String oemId, String accountId) {
        return "Not Implemented";
    }

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    public String determineCustomConfigIfAny(String oemId, String accountId) {
        return  accountInfoLookupFactory
                .getAccountInfoLookupInstance(oemId)
                .determineCustomConfigIfAny(accountId);
    }
}
