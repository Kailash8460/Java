package DSA.Solutions;

public class Solution_05 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // int[] arr = {1, 2, 3, 4};
        // int[] arr = {-1, -2, -3, -4};
        // int[] arr = {5};
        // int[] arr = {-3, -5, -2, -8};
        // int[] arr = {0, 0, 0, 0};
        // int[] arr = {3, 4, -10};
        // int[] arr = {1, -1, 1, -1, 1};
        // int[] arr = {5, 6, -100, 7, 8};
        int maxSum = arr[0];
        int currentSum = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
