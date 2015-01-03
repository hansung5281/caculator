package com.study;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int num1 = 10, num2 = 1;
		Coculator coculator = new Coculator();
		System.out.println("값을 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		int Add_result = coculator.Add(num1, num2);
		int Minus_result = coculator.Minus(num1, num2);
		int Multi_result = coculator.Multi(num1, num2);
		float Divide_result = coculator.Divide(num1, num2);
		
		//출력기능추가!//
		System.out.println("Add_result = " + Add_result);
		System.out.println("Minus_result = " + Minus_result);
		System.out.println("Multi_result = " + Multi_result);
		System.out.println("Divide_result = " + Divide_result);
	}
}
