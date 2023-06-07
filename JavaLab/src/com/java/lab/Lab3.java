/*
 * 3. How do you remove spaces from a string in Java?
 */
package com.java.lab;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String name: ");
		str = sc.nextLine();

		str = str.replaceAll(" ", ""); // means remove space

		System.out.println("\nString without Spaces = " + str);

	}

}
