
/*
 * i/p: My Name Is Ankit
 * o/p
 * words: 4
 * letter: 13
 */
package com.java.lab;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String name: ");
		String str = sc.nextLine();

		int count = 1;
		int count1 = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;

			}
		}
		System.out.println("Number of words in a string: " + count);

		for (int j = 0; j < str.length(); j++) {
			count1 = str.length();
		}
		System.out.println("The String of letters number : " + count1);
	}
}
