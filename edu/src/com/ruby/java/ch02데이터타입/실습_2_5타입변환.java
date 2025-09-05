package com.ruby.java.ch02데이터타입;

import java.util.Scanner;

public class 실습_2_5타입변환 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double b = num;
		System.out.println("정수변수 값 = " + num + ", 실수변수값 = " + b);
		
		double c = sc.nextDouble();
		int d = (int)c;
		
		System.out.println("정수변수 값 = " + c + ", 실수변수값 = " + d);
		
		
	}

}
