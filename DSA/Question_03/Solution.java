package DSA.Question_03;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // int[] prices = {7, 6, 4, 3, 1};
        // int[] prices = {1, 2, 3, 4, 5};
        // int[] prices = {3, 8, 2, 5, 7, 1, 9};
        // int[] prices = {7, 1, 5, 6, 3, 4};
        // int[] prices = {5};
        int profit = 0;
        int length = prices.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (prices[i] < prices[j]) {
                    int currentProfit = prices[j] - prices[i];
                    if (currentProfit > profit) {
                        profit = currentProfit;
                    }
                }
            }
        }
        System.out.println(profit);
    }
}
