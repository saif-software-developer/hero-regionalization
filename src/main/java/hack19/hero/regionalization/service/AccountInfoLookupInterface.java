package hack19.hero.regionalization.service;

public interface AccountInfoLookupInterface {

    String determineOEMIdForAccount(String accountId);

    String determineZoneForAccount(String accountId);

    String determineRegionForAccount(String accountId);

    String determineCustomConfigIfAny(String accountId);
}
