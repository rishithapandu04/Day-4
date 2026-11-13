import java.util.LinkedHashSet;

public class Product1 {
    public static void main(String[] args) {
    LinkedHashSet<String>products = new LinkedHashSet<>();
    products.add("pc");
    products.add("mobile");
    products.add("smartwatch");
    products.add("headphones");
    products.add("pc");
    System.out.println("All products:" + products);
    products.remove("headphones");
    products.add("tab");
    System.out.println("Moblie exists:" + products.contains("mobile"));
    System.out.println("Final product list:" + products);
}

}