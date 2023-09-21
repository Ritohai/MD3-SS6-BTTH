package TH3;

public class TH3 {
    public static void main(String[] args) {
        Category category = new Category(1, "Áo");
        Category category1 = new Category(2, "Quần");
        Product product = new Product(1, "Áo phông", 25, category);
        Product product1 = new Product(2, "Quần dài", 30, category1);
        Product product2 = new Product(3, "Áo sơ mi", 55, category);
        Product product3 = new Product(4, "Quần kaki", 40, category1);
        System.out.println(category.display());
        System.out.println(category1.display());
        System.out.println(product.display());
        System.out.println(product1.display());
        System.out.println(product2.display());
        System.out.println(product3.display());
    }
}
