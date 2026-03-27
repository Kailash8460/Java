package DSA.Solutions;

public class Solution_02 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        // int[] arr = {3, 2, 4};
        // int[] arr = {1, 2, 3};
        int target = 9;
        // int target = 6;
        // int target = 7;
        boolean result = false;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == target) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
