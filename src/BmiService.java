public class BmiService {

    public int calculate(double kilograms, double meters) {

        double bmiIndex;
        double bmi = kilograms / (meters * meters);
        bmiIndex = (int) bmi;
        return (int) bmiIndex;
    }
}
