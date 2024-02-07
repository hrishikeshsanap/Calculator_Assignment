package CalculatorApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorImplementation extends Calculator {

	public void menu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Percentage");
		System.out.println("6.Square");
		System.out.println("7.Squareroot");
		System.out.println("8.Modulus");
	}

	@Override
	public void add() {
		try {
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			int i = 1;

			System.out.println("Enter numbers to add (enter 0 to calculate):");
			while (i != 0) {
				try {
					i = sc.nextInt();
					sum += i;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a valid integer.");
					sc.next(); // Consume the invalid input
				}
			}

			System.out.println("Addition: " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integers");
		}
	}

	@Override
	public void sub() {
		try {
			Scanner sc = new Scanner(System.in);
			int num;
			boolean firstNumber = true;
			int result = 0;

			System.out.println("Enter numbers to subtract (enter 0 to calculate):");
			while (true) {
				num = sc.nextInt();
				if (num == 0)
					break;
				if (firstNumber) {
					result = num;
					firstNumber = false;
				} else {
					result -= num;
				}
			}

			System.out.println("Subtraction: " + result);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integers");
		}
	}

	@Override
	public void mul() {
		try {
			Scanner sc = new Scanner(System.in);
			int mul = 1;

			System.out.println("Enter numbers to multiply (enter 0 to calculate):");
			while (true) {
				try {
					int num = sc.nextInt();
					if (num == 0)
						break;
					mul *= num;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a valid integer.");
					sc.next(); // Consume the invalid input
				}
			}

			System.out.println("Multiplication: " + mul);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Integers");
		}
	}

	@Override
	public void div() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter dividend:");
			int dividend = sc.nextInt();

			System.out.println("Enter divisor:");
			int divisor = sc.nextInt();

			if (divisor == 0) {
				throw new ArithmeticException("Division by zero is not allowed.");
			} else {
				System.out.println("Division: " + ((double) dividend / divisor));
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid integer.");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void percentage() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter total value:");
			double total = sc.nextDouble();

			System.out.println("Enter percentage:");
			double percentage = sc.nextDouble();

			double result = (total * percentage) / 100;
			System.out.println("Percentage: " + result);
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers.");
		}
	}

	@Override
	public void square() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a number:");
			double num = sc.nextDouble();

			double result = num * num;
			System.out.println("Square: " + result);
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number.");
		}
	}

	@Override
	public void squareRoot() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a number:");
			double num = sc.nextDouble();

			if (num < 0) {
				throw new ArithmeticException("Square root of a negative number is not allowed.");
			}

			double result = Math.sqrt(num);
			System.out.println("Square Root: " + result);
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number.");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void modulus() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter dividend:");
			int dividend = sc.nextInt();

			System.out.println("Enter divisor:");
			int divisor = sc.nextInt();

			if (divisor == 0) {
				throw new ArithmeticException("Division by zero is not allowed.");
			} else {
				int result = dividend % divisor;
				System.out.println("Modulus: " + result);
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid integer.");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
