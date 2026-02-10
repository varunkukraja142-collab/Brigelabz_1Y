import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);
        }

        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("\nPerson %d\n", (i + 1));
            System.out.printf("Height: %.2f m\n", height[i]);
            System.out.printf("Weight: %.2f kg\n", weight[i]);
            System.out.printf("BMI: %.2f\n", bmi[i]);

            if (bmi[i] < 18.5) {
                System.out.println("Status: Underweight");
            } else if (bmi[i] < 25) {
                System.out.println("Status: Normal");
            } else if (bmi[i] < 30) {
                System.out.println("Status: Overweight");
            } else {
                System.out.println("Status: Obese");
            }
        }

    }
}
