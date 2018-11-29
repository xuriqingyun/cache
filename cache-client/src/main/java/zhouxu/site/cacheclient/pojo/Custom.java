package zhouxu.site.cacheclient.pojo;

public class Custom {
    private Integer customId;

    private String customName;

    private String customSex;

    private String customPhone;

    private String customAddress;

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getCustomSex() {
        return customSex;
    }

    public void setCustomSex(String customSex) {
        this.customSex = customSex == null ? null : customSex.trim();
    }

    public String getCustomPhone() {
        return customPhone;
    }

    public void setCustomPhone(String customPhone) {
        this.customPhone = customPhone == null ? null : customPhone.trim();
    }

    public String getCustomAddress() {
        return customAddress;
    }

    public void setCustomAddress(String customAddress) {
        this.customAddress = customAddress == null ? null : customAddress.trim();
    }

    @Override
    public String toString() {
        return "Custom{" +
                "customId=" + customId +
                ", customName='" + customName + '\'' +
                ", customSex='" + customSex + '\'' +
                ", customPhone='" + customPhone + '\'' +
                ", customAddress='" + customAddress + '\'' +
                '}';
    }
}