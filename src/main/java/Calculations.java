import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Calculations {

    public double calculatePower(double number) {
        return Math.pow(number, 2);
    }

    public double calculateRoot(double number) {
        double root = 0;

        if (number < 0) {
            System.out.println("Can't calculate root of negative number");
        } else {
            root = Math.sqrt(number);
        }
        return root;
    }
}
