package com.study;

public class Caculator {
	 int add(int num1, int num2)
	{
		int result = num1 + num2;
		return result;
	}
	protected int minus(int num1, int num2)
	{
		int result = num1 - num2;
		return result;
	}
	protected int multi(int num1, int num2)
	{
		int result = num1 * num2;
		return result;
	}
	protected float divide(float num1, float num2)
	{
		float result = num1/ num2;
		return result;
	}
	
	protected String toHexString(int num3)
	{
		String toHexString = Integer.toHexString(num3);
		return toHexString;
	}
	
}
