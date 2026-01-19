//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.72;
        double weight = 60;
        double bmiIndex = service.calculate(weight, height);
        System.out.println(bmiIndex);
    }
}