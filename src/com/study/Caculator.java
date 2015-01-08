package com.study;

public class Caculator {
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	protected int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	protected int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	protected float divide(float num1, float num2) {
		float result = num1 / num2;
		return result;
	}

	protected String toHexString(int num) {
		String toHexString = Integer.toHexString(num);
		return toHexString;
	}

	protected void toHexString2(int num) {
		int squreCount = 0,
			squreNum = 1,
			remainderNum = 0,
			index = 0,
			maxIndex = 0,
			tmpNum;
		
		int hexArray[] = new int[100];
		
		tmpNum = num;
		while (true) {

			if (index == 0 && tmpNum < 16) {
				hexArray[index] = tmpNum;
				break;
			}

			else if (index == 0 && tmpNum > 16) {
				while (true) {
					if (squreCount == 0)
						remainderNum = tmpNum;

					if ((tmpNum / 16) < 1) {
						hexArray[index] = tmpNum;
						maxIndex = squreCount;

						while (squreCount > 0) {
							squreNum = squreNum * 16;
							squreCount--;
						}
						tmpNum = remainderNum - (squreNum * tmpNum);
						break;

					} else {
						tmpNum = tmpNum / 16;
						index++;
						squreCount++;
					}

				}
			}

			else if (index != 0 & tmpNum < 16) {
				while (true) {
					index--;
					if (index != 0) {
						hexArray[index] = 0;
					} else {
						hexArray[index] = tmpNum;
						break;
					}
				}
				break;
			}

			else if (index != 0 && tmpNum >= 16) {

				index = 0;
				while (true) {
					if (squreCount == 0) {
						remainderNum = tmpNum;
					}

					if ((tmpNum / 16) < 1) {
						hexArray[index] = tmpNum;
						squreNum = 1;

						while (squreCount > 0) {
							squreNum = squreNum * 16;
							squreCount--;
						}
						tmpNum = remainderNum - (squreNum * tmpNum);
						break;

					} else {
						tmpNum = tmpNum / 16;
						index++;
						squreCount++;
					}
				}
			}

		}
		
		System.out.print("toHexStringResult(직접구현한 로직계산값) = ");
		while (maxIndex >= 0) {
			if (hexArray[maxIndex] < 10)
				System.out.print(hexArray[maxIndex]);
			else if (hexArray[maxIndex] == 10)
				System.out.print("a");
			else if (hexArray[maxIndex] == 11)
				System.out.print("b");
			else if (hexArray[maxIndex] == 12)
				System.out.print("c");
			else if (hexArray[maxIndex] == 13)
				System.out.print("d");
			else if (hexArray[maxIndex] == 14)
				System.out.print("e");
			else if (hexArray[maxIndex] == 15)
				System.out.print("f");

			maxIndex--;
		}
		System.out.println("");
	}
}
