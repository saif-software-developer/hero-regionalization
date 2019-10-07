package hack19.hero.regionalization.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
import java.util.Objects;

@DynamoDBTable(tableName="OEMContentPriority")
public class OEMContentPriority {
    @DynamoDBHashKey(attributeName="oemId")
    private String  oemId;
    @DynamoDBAttribute(attributeName="priorityList")
    private List    priorityList;

    public OEMContentPriority(String oemId, List priorityList) {
        this.oemId = oemId;
        this.priorityList = priorityList;
    }

    public OEMContentPriority() {
    }

    public String getOemId() {
        return oemId;
    }

    public void setOemId(String oemId) {
        this.oemId = oemId;
    }

    public List<String> getPriorityList() {
        return priorityList;
    }

    public void setPriorityList(List<String> priorityList) {
        this.priorityList = priorityList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OEMContentPriority that = (OEMContentPriority) o;
        return Objects.equals(oemId, that.oemId) &&
                Objects.equals(priorityList, that.priorityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oemId, priorityList);
    }

    @Override
    public String toString() {
        return "OEMContentPriority{" +
                "oemId='" + oemId + '\'' +
                ", priorityList=" + priorityList +
                '}';
    }
}
