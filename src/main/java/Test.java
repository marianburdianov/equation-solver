import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Double> listOfArguments = new ArrayList<>();

        listOfArguments.add(1.0);
        listOfArguments.add(4.0);
        listOfArguments.add(-21.0);

        Calculations calculations = new Calculations();
        EquationSolver equationSolver = new EquationSolver(listOfArguments, calculations);

        equationSolver.getDelta();
        equationSolver.getDeltaRoot();

        equationSolver.getX1();
        equationSolver.getX2();

    }
}