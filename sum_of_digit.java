package com.nissan.app;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = s.nextLine();
		int l = str.length();
		int sum = 0;
		for (int i = 0; i < l; i++) {
			if (Character.isDigit(str.charAt(i))) {
				int digit = Character.getNumericValue(i);
				sum = sum + digit;

			}

		}
		System.out.println("Sum of all digits in the string :  " + sum);

	}
}