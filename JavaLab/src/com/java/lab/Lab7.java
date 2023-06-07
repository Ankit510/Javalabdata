package com.java.lab;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String name: ");
		String str = sc.nextLine();

		int l = str.length();
		String rev = " ";
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse of is : " + rev);

	}

}
