package com.ruby.java.ch02데이터타입;

public class MinBillCount {
	
	public static void main(String[] args) {
		
		int money = 167000;
		int bill50 = money / 50000; 
		int bill10 = money / 10000;
		int bill5 = money / 5000;
		int bill1 = money / 1000;
		
		money %= bill50 * 50000;
		money %= bill10 * 10000;
		money %= bill5 * 5000;
		money %= bill1 * 1000;
		
		System.out.println(money);
	}}
