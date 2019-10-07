package hack19.hero.regionalization.repository;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import hack19.hero.regionalization.model.OEMContentMap;
import hack19.hero.regionalization.model.OEMContentPriority;

import javax.inject.Singleton;

@Singleton
public class AccountContentRepository {

    private AmazonDynamoDB client;
    private DynamoDB dynamoDB = null;
    private Table table = null;
    private DynamoDBMapper mapper = null;

    public AccountContentRepository() {
        String region = "us-east-1";

        client = AmazonDynamoDBClientBuilder.standard()
                .withRegion(region)
                .build();

        dynamoDB = new DynamoDB(client);
        mapper = new DynamoDBMapper(client);
    }

    public Item findAccountPriority(String oemId){
        return getOEMContentPriorityTable().getItem("oemId",oemId);
    }

    public Item findAccountContentMap(String oemId){
        return getOEMContentMapTable().getItem("oemId",oemId);
    }

    //TODO : validate the result that's coming back from dynamoDB if not null
    public OEMContentPriority findOEMContentPriority(String oemId){
        OEMContentPriority partitionKey = new OEMContentPriority();

        partitionKey.setOemId(oemId);
        DynamoDBQueryExpression<OEMContentPriority> queryExpression = new DynamoDBQueryExpression<OEMContentPriority>()
                .withHashKeyValues(partitionKey);

        return mapper.query(OEMContentPriority.class, queryExpression).get(0);
    }

    //TODO : validate the result that's coming back from dynamoDB if not null
    public OEMContentMap findOEMContentMap(String oemId){
        OEMContentMap partitionKey = new OEMContentMap();

        partitionKey.setOemId(oemId);
        DynamoDBQueryExpression<OEMContentMap> queryExpression = new DynamoDBQueryExpression<OEMContentMap>()
                .withHashKeyValues(partitionKey);

        return mapper.query(OEMContentMap.class, queryExpression).get(0);
    }

    private Table getOEMContentPriorityTable(){
        if(table == null) {
            table = dynamoDB.getTable("OEMContentPriority");
        }
        return table;
    }

    private Table getOEMContentMapTable(){
        if(table == null) {
            table = dynamoDB.getTable("OEMContentMap");
        }
        return table;
    }

}
