package com.theHimanshuSpot;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Bank {
	
	private double[] accounts;
	public final int SIZE = 100;
	
	public Bank(double amount) {
		accounts = new double[SIZE];
		Arrays.fill(accounts, amount);
	}
	
	public void transfer(int from, int to, double amount) {
		
		if(accounts[from]<amount)
			return;
		System.out.printf("transferring amount %f from account %d to account %d",amount,from,to);
		
		accounts[from]-=amount;
		accounts[to]+=amount;

		double total = total();
		System.out.printf(" .Transfer done. total amount = %f",total);
		System.out.println();
		
	}

	public double total(){

		double sum = Arrays.stream(accounts).sum();
		return sum;
	}

}
