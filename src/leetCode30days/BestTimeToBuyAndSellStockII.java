package leetCode30days;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {

        int[] arr = {2,7,4,1,8,1};
        System.out.println(maxProfit(arr));
        
    }
    
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
            maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }

    
}