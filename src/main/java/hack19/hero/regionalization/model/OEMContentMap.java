package hack19.hero.regionalization.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.Map;

@DynamoDBTable(tableName = "OEMContentMap")
public class OEMContentMap {
    @DynamoDBHashKey(attributeName="oemId")
    private String              oemId;
    @DynamoDBAttribute(attributeName="zoneMap")
    private Map<String,Map<String, String> >  zoneMap;
    @DynamoDBAttribute(attributeName="regionMap")
    private Map<String,Map<String, String> >   regionMap;
    @DynamoDBAttribute(attributeName="nationalMap")
    private Map<String, Map<String, String> >   nationalMap;
    @DynamoDBAttribute(attributeName="customMap")
    private Map<String, Map<String, String> >   customMap;
    @DynamoDBAttribute(attributeName="defaultHeroContent")
    private  Map<String, Map<String, String> >  defaultHeroContent;

    public OEMContentMap() {
    }

    public Map<String, Map<String, String> > mapByName(String name){
        if(name.equals("zoneMap")){
            return zoneMap;
        }else if(name.equals("regionMap")){
            return regionMap;
        }else if(name.equals("nationalMap")){
            return nationalMap;
        }else if(name.equals("customMap")){
            return customMap;
        }else if(name.equals("defaultHeroContent")){
            return defaultHeroContent;
        }
        return null;
    }

    public String getOemId() {
        return oemId;
    }

    public void setOemId(String oemId) {
        this.oemId = oemId;
    }

    public Map<String, Map<String, String>> getZoneMap() {
        return zoneMap;
    }

    public void setZoneMap(Map<String, Map<String, String>> zoneMap) {
        this.zoneMap = zoneMap;
    }

    public Map<String, Map<String, String>> getRegionMap() {
        return regionMap;
    }

    public void setRegionMap(Map<String, Map<String, String>> regionMap) {
        this.regionMap = regionMap;
    }

    public Map<String, Map<String, String>> getNationalMap() {
        return nationalMap;
    }

    public void setNationalMap(Map<String, Map<String, String>> nationalMap) {
        this.nationalMap = nationalMap;
    }

    public Map<String, Map<String, String>> getCustomMap() {
        return customMap;
    }

    public void setCustomMap(Map<String, Map<String, String>> customMap) {
        this.customMap = customMap;
    }

    public Map<String, Map<String, String>> getDefaultHeroContent() {
        return defaultHeroContent;
    }

    public void setDefaultHeroContent(Map<String, Map<String, String>> defaultHeroContent) {
        this.defaultHeroContent = defaultHeroContent;
    }
}
