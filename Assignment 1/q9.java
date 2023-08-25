package com.nissan.app;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter salary of Raju : ");
		double salary = s.nextDouble();
		double total = salary+(salary*.4)+(salary*.6);
		System.out.println("Total salary of Raju: "+(total));
		s.close();

	}

}
