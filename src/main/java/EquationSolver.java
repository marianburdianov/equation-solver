import lombok.Getter;

import java.util.ArrayList;

@Getter
public class EquationSolver {
    ArrayList<Double> listOfArguments;
    Calculations calculations;

    public EquationSolver(ArrayList<Double> listOfArguments, Calculations calculations) {
        this.listOfArguments = listOfArguments;
        this.calculations = calculations;
    }

    public double getDelta() {
        return calculations.calculatePower(listOfArguments.get(1)) - 4 * listOfArguments.get(0) * listOfArguments.get(2);
    }

    public double getDeltaRoot() {
        return calculations.calculateRoot(getDelta());
    }

    public double getX1() {
        double x1 = 0;
        try {
            x1 = (-listOfArguments.get(1) + getDeltaRoot()) / (2 * listOfArguments.get(0));
            System.out.println("x1 = " + x1);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        return x1;
    }

    public double getX2() {
        double x2 = 0;
        try {
            x2 = (-listOfArguments.get(1) - getDeltaRoot()) / (2 * listOfArguments.get(0));
            System.out.println("x2 = " + x2);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        return x2;
    }
}
