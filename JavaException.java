package com.tib.day1;

import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			
		}
	}

}
