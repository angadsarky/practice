package com.del;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		System.out.println("enter choice ");
		System.out.println("1.add 2.sub 3.mul 4.div");
		choice = sc.nextInt();

		Arthimetic[] arth = { new Addition(0, 0, 0), new Subtraction(0, 0, 0), new Multiply(0, 0, 0),
				new Divison(0, 0, 0) };

		arth[choice - 1].read();
		
		try {
			arth[choice - 1].calculate();
			arth[choice - 1].display();
		}
		catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
			
		}
		finally {
			sc.close();
		}

	}

	public static void main(String[] args) {

		new Calculator();

	}

}
