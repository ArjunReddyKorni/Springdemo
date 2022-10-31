package demo.spring.niit.spring;

public class Product {

    private int productId;
    private String productName;
    private int productCategory ;

    public Product(int productId, String productName, int productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory=" + productCategory +
                '}';
    }
}
