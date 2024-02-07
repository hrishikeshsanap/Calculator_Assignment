package CalculatorApp;

import java.util.Scanner;

public class CalculatorDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Welcome To Calculator*****");
		char ch;
		do {
			CalculatorImplementation ob = new CalculatorImplementation();
			ob.menu();
			System.out.println("Choose Your Option From Above");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				ob.add();
				break;
			case 2:
				ob.sub();
				break;
			case 3:
				ob.mul();
				break;
			case 4:
				ob.div();
				break;

			case 5:
				ob.percentage();
				break;
			case 6:
				ob.square();
				break;
			case 7:
				ob.squareRoot();
				break;
			case 8:
				ob.modulus();
				break;

			default:
				System.out.println("please enter valid no....");
				break;
			}
			System.out.println("press Y if want to continue Else press N");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		sc.close();
	}
}
