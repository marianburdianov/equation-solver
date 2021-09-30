import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class EquationSolverTest {

    @Mock
    private Calculations calculations;

    @InjectMocks
    private EquationSolver equationSolver;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        ArrayList<Double> listOfArguments = new ArrayList<>();
        listOfArguments.add(1.0);
        listOfArguments.add(4.0);
        listOfArguments.add(-21.);

        equationSolver = new EquationSolver(listOfArguments, calculations);
    }

    @Test
    void getDeltaTest() {
        ArrayList<Double> listOfArguments = new ArrayList<>();

        listOfArguments.add(1.0);
        listOfArguments.add(4.0);
        listOfArguments.add(-21.);

        when(calculations.calculatePower(listOfArguments.get(1))).thenReturn(16.0);
        double delta = equationSolver.getDelta();

        assertEquals(100, delta);

    }

    @Test
    void getDeltaRootTest() {
        double delta = equationSolver.getDelta();

        when(calculations.calculateRoot(delta)).thenReturn(10.0);

        double deltaRoot = equationSolver.getDeltaRoot();
        assertEquals(10, deltaRoot);
    }

    @Test
    void getX1Test() {

        double delta = equationSolver.getDelta();

        when(calculations.calculateRoot(delta)).thenReturn(10.0);

        double x1 = equationSolver.getX1();
        assertEquals(3, x1);
    }

    @Test
    void getX2Test() {

        double delta = equationSolver.getDelta();

        when(calculations.calculateRoot(delta)).thenReturn(10.0);

        double x2 = equationSolver.getX2();
        assertEquals(-7, x2);
    }
}