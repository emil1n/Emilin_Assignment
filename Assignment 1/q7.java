package com.nissan.app;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit : ");
		double temp = s.nextDouble();
		System.out.println("Temperature in Celcius is : "+(temp-32)*5/9);
		
		s.close();

	}

}
