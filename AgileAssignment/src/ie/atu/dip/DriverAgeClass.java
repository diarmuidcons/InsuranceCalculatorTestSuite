package ie.atu.dip;

import java.util.Scanner;

public class DriverAgeClass {
	// Class calculates premium based on age before accident premium is added
	static Scanner input = new Scanner(System.in);
	static int basicInsurance = 500;
	static int surcharge = 100; // under 25 years
	static int agePremium;
	// Class-level variables do not need to be in main method
	// Variables changed to static

	public static int ExperiencedDriver() {
		return agePremium = basicInsurance;
	}

	public static int YoungDriver() {
		return agePremium = basicInsurance + surcharge;
	}

	public static int DriverAge() {
		// Method negates the need for two switch statements in AccidentChargeClass

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		if (age < 25) {
			YoungDriver();
			System.out.println("Additional surcharge " + surcharge);

		}
		if (age >= 25) {
			ExperiencedDriver();
			System.out.println("No additional surcharge");

		}
		return agePremium; // Premium based on age of customer

	}
}
