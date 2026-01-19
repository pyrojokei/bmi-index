public class BmiService {

    public double calculate(double kilograms, double meters) {

        double bmiIndex;
        double bmi = (double) kilograms / (meters * meters);
        bmiIndex = (int) bmi;
        return bmiIndex;
    }
}
