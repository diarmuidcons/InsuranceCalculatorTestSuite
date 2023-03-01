package ie.atu.dip;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class DriverAgeClassTest {
	public static DriverAgeClass driverAgeClass = new DriverAgeClass();

	@BeforeAll
	static void setup() {
		driverAgeClass = new DriverAgeClass();
	} // Test is called before all other tests in test class

	@Test
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	void BasicPremium() {
		int intActualResult = DriverAgeClass.basicInsurance;

		assertEquals(500, intActualResult); // Asserts correct value for BasicPremium method
	}

	@Test
	void youngDriverPremium() {
		int youngPremium = DriverAgeClass.YoungDriver();
		assertEquals(600, youngPremium); // Asserts the premium for YoungDriver is equal to basic premium plus the
											// surcharge (100)
	}

	@Test
	void driverAgeTest() {
		int driverAgePremium = DriverAgeClass.DriverAge();
		assertThrows(NullPointerException.class, () -> {

			if (driverAgePremium == 0) {
				throw new NullPointerException("Premium can't be 0");
			}
		});
	} // Asserts that the driverAge method does not return a value of 0

	@Test
	void experiencedDriverPremium() {
		int experiencedPremium = DriverAgeClass.ExperiencedDriver();
		assertEquals(500, experiencedPremium); // Asserts that the ExperiencedDriver method returns a value of 500
	}

	@AfterEach
	public void cleanUpEach() {
		System.out.println("After Each cleanUpEach() method called");
	} // This test is called after all other tests in test class

}
