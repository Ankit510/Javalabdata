package com.java.lab;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		System.out.println("Enter a reverse string name : \n");

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		char[] c = s.toCharArray();

		for (int i = c.length; i >= 1; i--) {

			System.out.print(c[i - 1]);
		}
	}

}
