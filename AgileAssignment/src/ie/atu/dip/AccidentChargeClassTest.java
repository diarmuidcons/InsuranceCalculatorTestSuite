package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AccidentChargeClassTest {
	public static AccidentChargeClass accidentChargeClass = new AccidentChargeClass();

	@BeforeEach
	public static void SetUp() {
		accidentChargeClass = new AccidentChargeClass();
	} // Test is run before each of the test methods in this class

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5, 6 })
	void totalPremiumTest() {
		int premiumTest = accidentChargeClass.totalPremium();
		assertNotNull(premiumTest); // Asserts that the value of the totalPremium method from AccidentChargeClass is
									// not null

	}

	@Test
	void testExpectedException() {

		NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
			accidentChargeClass.accidentChargeCalculator();
		}, "Format of Answer Was Not Expected");

		Assertions.assertEquals(accidentChargeClass.accidentChargeCalculator(), thrown.getCause());
	} // Tests that the value derived from the accidentChargeCalculator method is in
		// the correct format

	@AfterAll
	public static void cleanUp() {
		System.out.println("After All cleanUp() method called");
	} // Method is called after all other methods in test class
}
