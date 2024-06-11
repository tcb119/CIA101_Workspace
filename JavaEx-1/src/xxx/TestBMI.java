package xxx;

public class TestBMI {
    public static void main(String[] args) {

        double high = 1.7;
        double weight = 60;
        double BMI = weight / Math.pow(high, 2);

        System.out.printf("BMI is " + BMI + "\n");

        if (BMI < 18.5) {
            System.out.println("Too Skin");
        } else if (18.5 <= BMI && BMI <= 24) {
            System.out.println("Normal");
        } else {
            System.out.println("Too Fat");
        }

    }
}
