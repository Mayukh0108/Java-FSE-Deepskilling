package EcommerceSearch;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear search by product name
    public static Product linearSearch(Product[] products, int targetName) {
        for (Product product : products) {
            if (product.productId == targetName) {
                return product;
            }
        }
        return null;
    }

    // Binary search by product name (array must be sorted)
    public static Product binarySearch(Product[] products, int targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetName)
                return products[mid];
            else if (products[mid].productId < targetName)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    // Sort products by product name
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(product -> product.productId));
    }
}