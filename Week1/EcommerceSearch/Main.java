package EcommerceSearch;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories"),
            new Product(5, "Smartwatch", "Accessories")
        };

        int targetName = 3;

        // Linear search
        Product linearResult = SearchDemo.linearSearch(products, targetName);
        if (linearResult != null) {
            System.out.println("Linear Search Result: " + linearResult);
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        // Binary search (requires sorted array)
        SearchDemo.sortProducts(products);
        Product binaryResult = SearchDemo.binarySearch(products, targetName);
        if (binaryResult != null) {
            System.out.println("Binary Search Result: " + binaryResult);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
    }
}
