package DSA.Question_07;

public class Solution {
    public static void main(String[] args) {
        // Linear Search
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        // int[] arr = {4, 5, 6, 7, 0, 1, 2};
        // int target = 3;
        // int[] arr = {1};
        // int target = 0;
        // int[] arr = {1, 2, 3, 4, 5};
        // int target = 3;
        // int[] arr = {2, 3, 4, 5, 1};
        // int target = 1;
        // int[] arr = {6, 7, 1, 2, 3, 4, 5};
        // int target = 1;
        // int[] arr = {2, 2, 2, 3, 2};
        // int target = 3;
        int length = arr.length;
        int result = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
        System.out.println(result);

        // Binary Search
        int[] binArr = {4, 5, 6, 7, 0, 1, 2};
        int binTarget = 0;
        int binResult = search(binArr, binTarget);
        System.out.println(binResult);
    }

    public static int search(int[] arr, int target) {
        int left = 0;
        int length = arr.length;
        int right = length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // target found
            if (arr[mid] == target) {
                return mid;
            }
            // duplicate elements edge case
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            }
            // left half is sorted
            else if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // right half is sorted
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
