package DSA.Solutions;

public class Solution_04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // int[] arr = {2, 3, 4, 5};
        // int[] arr = {1, 0, 3, 4};
        int length = arr.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int product = 1;
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
