package com.nissan.app;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = s.nextInt();		
		System.out.println("Enter num2: ");
		int num2 = s.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping");
		System.out.println("num1 = "+num1);
		System.out.println("num2= "+num2);
		s.close();

	}

}
