package hack19.hero.regionalization.service;

import hack19.hero.regionalization.model.AccountInfo;

public interface AccountInfoServiceInterface {

    AccountInfo determineAccountInfo(String accountId);

    /**
     * TODO: Figure out how to find the oem associated with the accountId
     * TODO: Figure out how to find the zone associated with accountId
     * TODO: Figure out how to find the region associated with accountId
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
    String determineOEMIdForAccount(String accountId);

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    String determineZoneForAccount(String oemId, String accountId);

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    String determineRegionForAccount(String oemId, String accountId);

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    String determineNationalBasis(String oemId, String accountId);

    /**
     * Not Implemented
     * @param accountId
     * @return
     */
    String determineCustomConfigIfAny(String oemId, String accountId);
}
