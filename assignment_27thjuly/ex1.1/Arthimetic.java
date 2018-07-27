package com.del;

import java.util.Scanner;

public abstract class Arthimetic {

	int num1, num2,num3;
	Scanner sc = new Scanner(System.in);
	
	

	public Arthimetic(int num1, int num2,int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3=0;
	}

	public void read() {
		System.out.println("enter number1");
		System.out.println("enter number2");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}

	abstract void calculate();

	public void display() {
		
		System.out.println("result is "+num3);
	}

}
