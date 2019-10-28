package hack19.hero.regionalization.util;

import hack19.hero.regionalization.service.LincolnAccountInfoLookupImpl;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AccountInfoLookupFactory {

    @Inject
    private LincolnAccountInfoLookupImpl lincolnAccountInfoLookup;

    public LincolnAccountInfoLookupImpl getAccountInfoLookupInstance(String oemId){
        if(oemId.equals("Lincoln")){
            return lincolnAccountInfoLookup;
        }

        //TODO: log "oemId not found" message
        return null;
    }

}
