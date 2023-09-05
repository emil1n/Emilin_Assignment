package com.nissan.app;

import java.util.Scanner;

public class replace_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=scan.nextLine();
		System.out.println(s.replace("is", "is not"));
	}

}