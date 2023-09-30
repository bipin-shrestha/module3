//Import the necessary library
import java.util.Scanner;
//Define Class module3
public class module3 {
	//Define the main method
	public static void main(String[] args) {
		//Create Scanner object
		Scanner scanner = new Scanner(System.in);
		//To enter user input
		System.out.println("Please enter your income :  ");
		//Declare variable to store the tax rates and income
		double taxrate;
		double income = scanner.nextDouble();
		//Determine the tax rates on the base of income 
		if(income < 500) {
			taxrate = 0.10; // Tax rate is 10% for income less than 500
		} else if (income < 1500) {
			taxrate = 0.15; // Tax rate is 15% for the income greater than/equal to $500 and less than $1500
		} else if (income < 2500) {
			taxrate = 0.20; // Tax rate is 20% for the income greater than/equal to $1500 and less than $2500 
		} else {
			taxrate = 0.30; // Tax rate is 30% for the income greater than/equal to $2500
		}
		//Calculate the total and print 
		double total = income * taxrate;
		System.out.println("Weekly Average tax withholding for a customer : $" + total);
		//close the scanner
		scanner.close();
	}
}
