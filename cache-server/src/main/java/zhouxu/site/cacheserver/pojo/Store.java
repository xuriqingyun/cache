package zhouxu.site.cacheserver.pojo;

public class Store {
    private Integer productId;

    private Integer prudctCount;

    private String productAddress;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPrudctCount() {
        return prudctCount;
    }

    public void setPrudctCount(Integer prudctCount) {
        this.prudctCount = prudctCount;
    }

    public String getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(String productAddress) {
        this.productAddress = productAddress == null ? null : productAddress.trim();
    }
}