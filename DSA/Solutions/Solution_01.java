package DSA.Solutions;

public class Solution_01 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        // int[] arr = {1, 1, 1, 1};
        // int[] arr = {-5, -2, -9, -1};
        int length = arr.length;
        int max = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
