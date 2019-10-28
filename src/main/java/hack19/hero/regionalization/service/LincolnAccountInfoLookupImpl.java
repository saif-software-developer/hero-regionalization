package hack19.hero.regionalization.service;

import javax.inject.Singleton;

@Singleton
public class LincolnAccountInfoLookupImpl
        implements AccountInfoLookupInterface {

    @Override
    public String determineOEMIdForAccount(String accountId) { return "lincoln"; }

    @Override
    public String determineZoneForAccount(String accountId) { return "A"; }

    @Override
    public String determineRegionForAccount(String accountId) {
        return "southwest";
    }

    @Override
    public String determineCustomConfigIfAny(String accountId) {
        return "BlackLabel";
    }

}
