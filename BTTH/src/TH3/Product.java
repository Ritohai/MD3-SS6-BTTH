package TH3;

public class Product {
    private int productId;
    private String productName;
    private float productPrice;
    private Category category;

    public Product() {
    }

    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
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

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String display() {
        return "Thông tin sản phẩm: " +
                "id: " + productId + "," +
                "Tên sản phẩm: " + productName + "," +
                "Giá sản phẩm: " + productPrice + "," +
                "Danh mục: " + category.categoryName;
    }

}
