package com.calci;

public class Divison {
	public double div(double num1,double num2) {
		if(num2 ==0 ) {
			throw new ArithmeticException("invalid divisor");
		}
		return num1/num2;
		
	}
}

