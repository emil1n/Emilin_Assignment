package com.nissan.app;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter i: ");
		int a = s.nextInt();		
		System.out.println("Enter j: ");
		int b = s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("i = "+a);
		System.out.println("j = "+b);
		s.close();

	}

}
