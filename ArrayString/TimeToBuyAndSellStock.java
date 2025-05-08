import java.util.*;
public class TimeToBuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int profitSize = prices.length;
            int [] maxProfit = new int[profitSize];
            int tempProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    tempProfit += prices[i] - prices[i - 1];
                    maxProfit[i] = tempProfit;
                }
            }
            int profit = 0;
            for (int i = 0; i < maxProfit.length; i++) {
                if (maxProfit[i] > profit) {
                    profit = maxProfit[i];
                }
            }
            return profit;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}