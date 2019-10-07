package hack19.hero.regionalization.util;

import hack19.hero.regionalization.model.AccountInfo;
import hack19.hero.regionalization.model.HeroContent;
import hack19.hero.regionalization.model.OEMContentMap;

import java.util.Map;

public class HeroContentFactory {

    // Expected : map, key
    // Lookup the key in the map
    // If exits, return the result
    // else return null
    public static Map<String, String> lookupHeroContentInMap(String priority,
                                                     AccountInfo accountInfo,
                                                     OEMContentMap oemContentMap){

        if(priority.equals("zoneMap")){
            Map<String, Map<String, String> > zoneMap  =   oemContentMap.mapByName("zoneMap");
            String zoneId =   accountInfo.getAccountZone();

            if(zoneMap.get(zoneId)   !=  null){
                return zoneMap.get(zoneId);
            }else{
                return null;
            }
        }
        if(priority.equals("regionMap")){
            Map<String, Map<String, String> > regionMap  =   oemContentMap.mapByName("regionMap");
            String regionId =   accountInfo.getAccountRegion();

            if(regionMap.get(regionId)   !=  null){
                return regionMap.get(regionId);
            }else{
                return null;
            }
        }
        if(priority.equals("nationalMap")){
            Map<String, Map<String, String> > nationalMap  =   oemContentMap.mapByName("nationalMap");
            String nationalId =   accountInfo.getNationalBasis();

            if(nationalMap.get(nationalId)   !=  null){
                return nationalMap.get(nationalId);
            }else{
                return null;
            }
        }
        if(priority.equals("customMap")){
            Map<String, Map<String, String> > customMap  =   oemContentMap.mapByName("customMap");
            String customId =   accountInfo.getCustomConfig();

            if(customMap.get(customId)   !=  null){
                return customMap.get(customId);
            }else{
                return null;
            }
        }
        return null;
    }


}
