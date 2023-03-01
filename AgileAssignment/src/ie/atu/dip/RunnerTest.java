package ie.atu.dip;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// Test suite which pulls in both DriverAgeClassTest and AccidentChargeClassTest test methods and runs them
@Suite
@SelectClasses({ DriverAgeClassTest.class, AccidentChargeClassTest.class

})

class RunnerTest {

}
