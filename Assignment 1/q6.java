package com.nissan.app;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter distance (km): ");
		double a = s.nextDouble();

		System.out.println("Distance in meters: "+(a*1000));
		System.out.println("Distance in feet: "+(a*3280.84));
		System.out.println("Distance in inches: "+(a*39370.08));
		System.out.println("Distance in meters: "+(a*100000));
		
		

	}

}
