class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length<2) return prices[0];
        int total_profit = 0;
        int buy_stock = prices[0];
        for (int sell_stock = 1; sell_stock < prices.length; sell_stock++){
            if ((prices[sell_stock] - buy_stock ) > 0){
                //we have a profit add it to total profit
                total_profit += prices[sell_stock] - buy_stock;
            }
            buy_stock = prices[sell_stock];
        }
        return total_profit;
    }
}