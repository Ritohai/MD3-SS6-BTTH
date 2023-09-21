package TH3;

import java.util.List;

public class Category {
    private int categoryId;
    public String categoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String display() {
        return "Thông tin danh mục: " +
                "id: " + categoryId + "," +
                "Tên danh mục: " + categoryName;
    }
}
