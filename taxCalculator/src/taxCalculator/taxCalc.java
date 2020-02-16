package taxCalculator;
import java.util.Scanner;

public class taxCalc {
	//Class variables and values..
    static double taxRate = 0.0;
    static double taxOwed = 0.0;
    static double taxBracket = 0.0;

    //Functions for tax calculation
    public static void single(double taxR, double taxO, double taxB){
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter your taxable income:");
    	
    	int income = input.nextInt();
    	
    	if(income >= 0 && income <= 8350) {
    		taxR = 0.10;
    		taxB = taxR * 100;
    		taxO = income * taxR;
    		System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
    		System.out.println("The total amount of income tax owed is $" + taxO + ".");
    		System.out.println("Have a nice day!");
    	}
    	else if(income >= 8351 && income <= 33950) {
    		taxR = 0.15;
    		taxB = taxR * 100;
    		taxO = income * taxR;
    		System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
    		System.out.println("The total amount of income tax owed is $" + taxO + ".");
    		System.out.println("Have a nice day!");
    	}
    	else if(income >= 33951 && income <= 82250) {
    		taxR = 0.25;
    		taxB = taxR * 100;
    		taxO = income * taxR;
    		System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
    		System.out.println("The total amount of income tax owed is $" + taxO + ".");
    		System.out.println("Have a nice day!");
    	}
    	else if(income >= 82251 && income <= 171550) {
    		taxR = 0.28;
    		taxB = taxR * 100;
    		taxO = income * taxR;
    		System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
    		System.out.println("The total amount of income tax owed is $" + taxO + ".");
    		System.out.println("Have a nice day!");
    	}
    	else if(income >= 171551 && income <= 372950) {
    		taxR = 0.33;
    		taxB = taxR * 100;
    		taxO = income * taxR;
    		System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
    		System.out.println("The total amount of income tax owed is $" + taxO + ".");
    		System.out.println("Have a nice day!");
    	}
    	else if(income >= 372951) {
    		taxR = 0.35;
    		taxB = taxR * 100;
    		taxO = income * taxR;
    		System.out.println("Your tax bracket has an income tax rate of " + taxB + "%.");
    		System.out.println("The total amount of income tax owed is $" + taxO + ".");
    		System.out.println("Have a nice day!");
    	}

    }
    
    public static void mfj(double taxR, double taxO) {
    	
    }
    
    public static void mfs(double taxR, double taxO) {
    	
    }
    
    public static void head(double taxR, double taxO) {
    	
    }

    public static void main(String[] args){

        //Command line Menu.
        System.out.println("Hello and welcome to the tax calculator!");
        System.out.println("Please input your filing status based on the options below:");
        System.out.println("1 = Filing as Single.");
        System.out.println("2 = Filing as Married, jointly or a qualified widow(er).");
        System.out.println("3 = Filing as Married but filing seperatly.");
        System.out.println("4 = Filing as the Head of Household.");
        System.out.println("5 = Exit Tax Calculator.");

        //Taking the input.
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        //Switch to call the correct functions.
        while(true){
            switch(choice){
                case 1:
                	System.out.println("Filing as single:");
                    single(taxRate, taxOwed, taxBracket);
                    break;
                case 2:
                	System.out.println("Filing as Married, jointly or a qualified widow(er):");
                    mfj(taxRate, taxOwed);
                    break;
                case 3:
                	System.out.println("3 = Filing as Married but filing seperatly:");
                    mfs(taxRate, taxOwed);
                    break;
                case 4:
                	System.out.println("4 = Filing as the Head of Household:");
                    head(taxRate, taxOwed);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Sorry, but that is not a vlid selection. Please try again.");
                    break;
            }
            
            break;
        }
    }


}
