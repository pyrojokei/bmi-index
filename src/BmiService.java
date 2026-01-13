

public class BmiService {

    public double calculate(double kilograms, double meters) {

        boolean integerNumberKilo = kilograms == (int) kilograms;
        int indexWeight = (int) (integerNumberKilo ? kilograms : Math.round(kilograms));

        boolean integerNumberMeters = meters == (int) meters;
        int indexHeight = (int) (integerNumberMeters ? meters : Math.round(meters));

        double bmi = kilograms / (meters * meters);
        return bmi;

    }
}
