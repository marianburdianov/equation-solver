import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculationsTest {

    private Calculations calculations;

    @BeforeAll
    public void setUp() {

        calculations = new Calculations();
    }

    @Test
    void calculatePowerTest() {
        ArrayList<Double> listOfArguments = new ArrayList<>();

        listOfArguments.add(1.0);
        listOfArguments.add(4.0);
        listOfArguments.add(-21.);

        double powerOfNumber = calculations.calculatePower(listOfArguments.get(1));

        assertEquals(16, powerOfNumber);
    }

    @Test
    void calculateRootTest() {
        double numberForGetRoot = 25;

        double root = calculations.calculateRoot(numberForGetRoot);

        assertEquals(5, root);
    }
}