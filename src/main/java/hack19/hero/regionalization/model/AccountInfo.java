package hack19.hero.regionalization.model;

import java.util.Objects;

public class AccountInfo {

    private String  oemId;
    private String  accountZone;
    private String  accountRegion;
    private String  nationalBasis;
    private String  customConfig;

    public AccountInfo(String oemId, String accountZone, String accountRegion, String nationalBasis, String customConfig) {
        this.oemId = oemId;
        this.accountZone = accountZone;
        this.accountRegion = accountRegion;
        this.nationalBasis = nationalBasis;
        this.customConfig = customConfig;
    }

    public String getOemId() {
        return oemId;
    }

    public void setOemId(String oemId) {
        this.oemId = oemId;
    }

    public String getAccountZone() {
        return accountZone;
    }

    public void setAccountZone(String accountZone) {
        this.accountZone = accountZone;
    }

    public String getAccountRegion() {
        return accountRegion;
    }

    public void setAccountRegion(String accountRegion) {
        this.accountRegion = accountRegion;
    }

    public String getNationalBasis() {
        return nationalBasis;
    }

    public void setNationalBasis(String nationalBasis) {
        this.nationalBasis = nationalBasis;
    }

    public String getCustomConfig() {
        return customConfig;
    }

    public void setCustomConfig(String customConfig) {
        this.customConfig = customConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountInfo that = (AccountInfo) o;
        return Objects.equals(oemId, that.oemId) &&
                Objects.equals(accountZone, that.accountZone) &&
                Objects.equals(accountRegion, that.accountRegion) &&
                Objects.equals(nationalBasis, that.nationalBasis) &&
                Objects.equals(customConfig, that.customConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oemId, accountZone, accountRegion, nationalBasis, customConfig);
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "oemId='" + oemId + '\'' +
                ", accountZone='" + accountZone + '\'' +
                ", accountRegion='" + accountRegion + '\'' +
                ", nationalBasis='" + nationalBasis + '\'' +
                ", customConfig='" + customConfig + '\'' +
                '}';
    }
}
