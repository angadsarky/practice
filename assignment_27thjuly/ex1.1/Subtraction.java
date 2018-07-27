package com.del;

public class Subtraction extends Arthimetic {

	public Subtraction(int num1, int num2, int num3) {
		super(num1, num2, num3);
		
	}

	@Override
	void calculate() {
	
		num3=num1-num2;
		
		
	}

}
