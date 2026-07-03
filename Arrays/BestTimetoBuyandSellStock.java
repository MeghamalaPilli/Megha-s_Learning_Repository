/*121. Best Time to Buy and Sell Stock
Easy
Topics
premium lock icon
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
 */

import java.util.Scanner;
public class BestTimetoBuyandSellStock
{
    public int maxProfit(int[] prices)
    {
        if(prices==null||prices.length==0)
        {
            return 0;
        }
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            int currentprofit=prices[i]-minprice;
            if(currentprofit > maxprofit)
            {
                maxprofit=currentprofit;
            }
        }
        return maxprofit;
    }
    public static void main(String args[])
    {
        BestTimetoBuyandSellStock stock=new BestTimetoBuyandSellStock();   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n=sc.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter the prices of stocks for "+ n + "days");
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        int res=stock.maxProfit(prices);
        System.out.println("The maximum profit is " + res);
   }
}