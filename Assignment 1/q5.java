package com.nissan.app;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = s.nextDouble();
		System.out.println("Enter b: ");
		double b = s.nextDouble();
		
		System.out.println("Quotient is : "+(a/b)+" and remainder is : "+(a%b));
		s.close();

	}

}
