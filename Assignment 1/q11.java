package com.nissan.app;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = s.nextInt();
		int temp,rev=0;
		while(a>0) {
			temp=a%10;
			rev=(rev*10)+temp;
			a=a/10;
		}
		System.out.println("Reverse = "+rev);
		s.close();

	}

}
