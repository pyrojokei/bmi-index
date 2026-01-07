

public class BmiService {

    public double calculate(double kilograms, double meters)

    {

        boolean integerA = kilograms == (int) kilograms;
        int indexA = (int) (integerA ? kilograms : Math.round(kilograms));

        boolean integerB = meters == (int) meters;
        int indexB = (int) (integerB ? meters : Math.round(meters));

        double bmi = kilograms / (meters * meters);
        return bmi;




        //int bmi = integer ? a && b : Math.round
        // int bmi;
        // if (a == (int) a && b == (int) b) {
        //   bmi = (int) Math.round(a && b);
        //} else {
        // }


        // return 0;
    }
}
