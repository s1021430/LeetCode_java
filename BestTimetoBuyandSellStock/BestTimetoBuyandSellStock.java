package BestTimetoBuyandSellStock;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        var buy = prices[0];
        var maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            buy = Math.min(buy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-buy);
        }

        return maxProfit;
    }
}
