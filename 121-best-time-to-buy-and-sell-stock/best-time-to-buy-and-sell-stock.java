class Solution {
    public int maxProfit(int[] prices) {
        return helper(prices,0,Integer.MAX_VALUE,0);
    }

    public int helper(int[] prices,int i, int minValue , int maxProfit){
        if(prices.length==i){
            return maxProfit;
        }

        minValue=Math.min(prices[i],minValue);
        maxProfit=Math.max(maxProfit,prices[i]-minValue);

        return helper(prices,i+1,minValue,maxProfit);
    }
}