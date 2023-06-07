/*
 * 5. How do you get the sum of all elements in an integer array in Java?
 */
package com.java.lab;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in Array : ");
		for (int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
		System.out.print("Array Elemnts of Number: ");
		for (int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		sum=a[i]+sum;
		}
		System.out.println("\nAddition of Array Elemnts:  "+ sum);

		}

	}


