package ie.atu.dip;

import java.util.Scanner;

public class InsuranceProgram {
	// Runs program
	static Scanner input = new Scanner(System.in);

	// User input
	public static void main(String[] args) {
		// Calls methods from DriverAgeClass and AccidendtChargeClass
		DriverAgeClass.DriverAge();
		// Calculates basic premium based on age
		AccidentChargeClass acc = new AccidentChargeClass();
		acc.totalPremium();
		// Calculates total premium by adding the age premium to the result of the
		// accidentChargeCalculator method which is called within the totalPremium
		// method
	}

}
