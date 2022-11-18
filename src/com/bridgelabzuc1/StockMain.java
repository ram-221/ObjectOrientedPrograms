package com.bridgelabzuc1;

import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter no of stocks: ");
		int noOfStocks = read.nextInt();
		StockReport[] stocks = new StockReport[noOfStocks];

		for(int i = 0; i < noOfStocks; i++){

			System.out.println("Enter stock name: ");
			String stockName = read.next();

			System.out.println("Enter no of shares: ");
			int noOfShares = read.nextInt();

			System.out.println("Enter price of shares: ");
			int sharePrice = read.nextInt();

			stocks[i] = new StockReport(stockName,noOfShares,sharePrice);
		}
		
		StockReport sr = new StockReport();
		sr.displayReport(stocks);
		read.close();
	}
}
