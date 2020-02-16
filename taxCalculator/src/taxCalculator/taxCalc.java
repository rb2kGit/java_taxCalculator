package taxCalculator;

import java.util.Scanner;

public class taxCalc {
	// Class variables and values.
	static double taxRate = 0.0;
	static double taxOwed = 0.0;
	static double taxBracket = 0.0;
	static int choice;
	static double income;

	// Functions for tax calculation.

	// Single filing function.
	public static void single(double taxR, double taxO, double taxB) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your taxable income:");

		income = input.nextDouble();

		if (income >= 0 && income <= 8350) {
			taxR = 0.10;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 8351 && income <= 33950) {
			taxR = 0.15;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 33951 && income <= 82250) {
			taxR = 0.25;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 82251 && income <= 171550) {
			taxR = 0.28;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 171551 && income <= 372950) {
			taxR = 0.33;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 372951) {
			taxR = 0.35;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		}

	}

	// Married filing jointly function.
	public static void mfj(double taxR, double taxO, double taxB) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your taxable income:");

		income = input.nextInt();

		if (income >= 0 && income <= 16700) {
			taxR = 0.10;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");			
		} else if (income >= 16701 && income <= 67900) {
			taxR = 0.15;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 67901 && income <= 137050) {
			taxR = 0.25;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 137051 && income <= 208850) {
			taxR = 0.28;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 208851 && income <= 372950) {
			taxR = 0.33;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 372951) {
			taxR = 0.35;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		}

	}

	// Married single filing function.
	public static void mfs(double taxR, double taxO, double taxB) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your taxable income:");

		income = input.nextInt();

		if (income >= 0 && income <= 8350) {
			taxR = 0.10;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 8351 && income <= 33950) {
			taxR = 0.15;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 33951 && income <= 68525) {
			taxR = 0.25;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 68526 && income <= 104425) {
			taxR = 0.28;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 104426 && income <= 186475) {
			taxR = 0.33;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 186476) {
			taxR = 0.35;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		}

	}

	// Head of household filing function.
	public static void head(double taxR, double taxO, double taxB) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your taxable income:");

		income = input.nextInt();

		if (income >= 0 && income <= 11950) {
			taxR = 0.10;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 11951 && income <= 45500) {
			taxR = 0.15;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 45501 && income <= 117450) {
			taxR = 0.25;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 117451 && income <= 190200) {
			taxR = 0.28;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 190201 && income <= 372950) {
			taxR = 0.33;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		} else if (income >= 372951) {
			taxR = 0.35;
			taxB = taxR * 100;
			taxO = income * taxR;
			System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
			System.out.println("The total amount of income tax owed is $" + taxO + ".");
		}

	}

	public static void main(String[] args) {
		//Input scanner.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello and welcome to the tax calculator!");

		while (true) {
			// Command line Menu.
			System.out.println("Please input your filing status based on the options below:");
			System.out.println("1 = Filing as Single.");
			System.out.println("2 = Filing as Married, jointly or a qualified widow(er).");
			System.out.println("3 = Filing as Married but filing seperatly.");
			System.out.println("4 = Filing as the Head of Household.");
			System.out.println("5 = Exit Tax Calculator.");

			// Taking the input.
			choice = input.nextInt();

			// Switch to call the correct functions.
			switch (choice) {
			case 1:
				System.out.println("Filing as single:");
				single(taxRate, taxOwed, taxBracket);
				System.out.println("");
				break;
			case 2:
				System.out.println("Filing as Married, jointly or a qualified widow(er):");
				mfj(taxRate, taxOwed, taxBracket);
				System.out.println("");
				break;
			case 3:
				System.out.println("Filing as Married but filing seperatly:");
				mfs(taxRate, taxOwed, taxBracket);
				System.out.println("");
				break;
			case 4:
				System.out.println("Filing as the Head of Household:");
				head(taxRate, taxOwed, taxBracket);
				System.out.println("");
				break;
			case 5:
				System.out.println("Exiting... Have a nice day!");
				System.exit(0);
				
			default:
				System.out.println("Sorry, but that is not a valid selection. Please try again.");
				System.out.println("");
				break;
			}
		}
	}

}
