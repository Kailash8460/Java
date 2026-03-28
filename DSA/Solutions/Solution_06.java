package DSA.Solutions;

public class Solution_06 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        // int[] arr = {-2, 0, -1};
        // int[] arr = {-2, 3, -4};
        int maxProduct = 0;
        int currentProduct = 1;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            currentProduct *= arr[i];
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }
        System.out.println(maxProduct);
    }
}
