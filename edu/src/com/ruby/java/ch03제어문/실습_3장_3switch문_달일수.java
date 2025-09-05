package com.ruby.java.ch03제어문;

import java.util.Scanner;

/*
 * 달의 일 수 계산
 * int month = sc.nextInt()
 * switch(month) { 
 *     case1:
 *     		break;
 *     case3:
 *         days=31;
 * }
 * 
 */

public class 실습_3장_3switch문_달일수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : 
			System.out.println("31일 입니다"); break;
		case 4, 6, 9, 11 :
			System.out.println("30일 입니다"); break;
		case 2 :
			System.out.println("28일 또는 29일 입니다"); break;
		default :
			System.out.println("날짜를 입력하세요");
		}
	}
}
