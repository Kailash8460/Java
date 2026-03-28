package DSA.Solutions;

public class Solution_06 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        // int[] arr = {-2, 0, -1};
        // int[] arr = {-2, 3, -4};
        // int[] arr = {5};
        // int[] arr = {1, 2, 3, 4};
        // int[] arr = {-1, -2, -3, -4};
        // int[] arr = {-1, -2, -3};
        // int[] arr = {2, -3, 0, 4, -1, 2};
        // int[] arr = {2, -5, -2, -4, 3};
        // int[] arr = {1, 2, -100, 3, 4};
        int maxProduct = 0;
        int currentProduct = 1;
        int length = arr.length;
        int counter = 0;
        while (counter < length) {
            int i = counter;
            for (; i < length; i++) {
                currentProduct *= arr[i];
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
            counter++;
            currentProduct = 1;
        }
        System.out.println(maxProduct);
    }
}
