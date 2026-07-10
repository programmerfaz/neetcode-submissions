/*Best Time to Buy and Sell Stock II
Medium
Topics
Company Tags
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. However, you can buy it then immediately sell it on the same day. Also, you are allowed to perform any number of transactions but can hold at most one share of the stock at any time.

Find and return the maximum profit you can achieve.

Example 1:

Input: prices = [7,1,5,3,6,4]

Output: 7
*/

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