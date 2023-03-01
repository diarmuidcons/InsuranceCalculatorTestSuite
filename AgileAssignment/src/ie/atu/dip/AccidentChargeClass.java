package ie.atu.dip;

import java.util.Scanner;

public class AccidentChargeClass {
//Class calculates additional premium based on number of accidents
// this premium is added to premium from DriverAgeClass
	static Scanner input = new Scanner(System.in);

	public int accidentChargeCalculator() {
		// Calculates the extra charge based on number of accidents and adds this charge
		// to agePremium
		System.out.println("\nHow many accidents did you have? ");
		int accidents = input.nextInt();
		int surcharge = 0;
		switch (accidents) {
		case 0:
			System.out.println("No surcharge");
			break;
		case 1:
			surcharge = 50;
			System.out.println("Additional surcharge for accident: " + surcharge); // Pay
			// 550
			break;
		case 2:
			surcharge = 125;
			System.out.println("Additional surcharge for accident: " + surcharge); // Pay
			// 625;
			break;
		case 3:
			surcharge = 225;
			System.out.println("Additional surcharge for accident: " + surcharge); // Pay
			// 725;
			break;
		case 4:
			surcharge = 375;
			System.out.println("Additional surcharge for accident: " + surcharge); // Pay
			// 875;
			break;
		case 5:
			surcharge = 575;
			System.out.println("Additional surcharge for accident: " + surcharge); // Pay
			// 1075;
			break;
		}

		if (accidents >= 6)
			System.out.println("No insurance"); // Changed to greater than or equal to 6 to account for more than 6
												// accidents
		return surcharge;

	}

	public int totalPremium() {
		// Method calls switch statement above to calculate accident premium and adds it
		// to age premium
		int total = DriverAgeClass.agePremium + accidentChargeCalculator();
		System.out.println("Total amount to pay: " + total);
		return total;

	}

}
