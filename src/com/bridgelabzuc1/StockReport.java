package com.bridgelabzuc1;

public class StockReport {
	
    String stockName;
    int  noOfShares;
    float sharePrice;

   public StockReport(){

   }

   public StockReport(String stockName, int noOfShares, float sharePrice) {
       this.stockName = stockName;
       this.noOfShares = noOfShares;
       this.sharePrice = sharePrice;
   }

   public void displayReport(StockReport[] stock){

       for(int i = 0; i < stock.length; i++){
           System.out.println("Stock name = " + stock[i].stockName);
           System.out.println("Number of stock = " + stock[i].noOfShares);
           System.out.println("Share price = " + stock[i].sharePrice);
           System.out.println("*****************************");
           System.out.println("Total price = " + (stock[i].noOfShares * stock[i].sharePrice));
           System.out.println("*****************************");
       }
   }
}
