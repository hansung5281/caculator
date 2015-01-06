package com.study;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Caculator caculator = new Caculator();
		while (true) {
			System.out.println("원하는 메뉴를 선택하세요.");
			System.out.println("1.더하기" + "\n2.뺴기" + "\n3.곱하기" + "\n4.나누기"
					+ "\n5.16진수변환");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			if (choice != 5) {
				System.out.println("두 수를 입력하세요.");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
			}

			switch (choice) {
			case 1:
				int addResult = caculator.add(num1, num2);
				System.out.println("addResult = " + addResult);
				break;
			case 2:
				int minusResult = caculator.minus(num1, num2);
				System.out.println("minusResult = " + minusResult);
				break;
			case 3:
				int multiResult = caculator.multi(num1, num2);
				System.out.println("multiResult = " + multiResult);
				break;
			case 4:
				float divideResult = caculator.divide(num1, num2);
				System.out.println("divideResult = " + divideResult);
				break;
			case 5:
				System.out.println("숫자 하나를 입력하세요.");
				num1 = scanner.nextInt();
				String toHexStringResult = caculator.toHexString(num1);
				System.out.println("toHexStringResult = " + toHexStringResult);
				break;
			}
		}
	}
}
