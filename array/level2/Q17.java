import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] data = new double[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Height (in meters): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Weight (in kg): ");
            data[i][1] = sc.nextDouble();

            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);
        }

        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.printf("Height: %.2f m\n", data[i][0]);
            System.out.printf("Weight: %.2f kg\n", data[i][1]);
            System.out.printf("BMI: %.2f\n", data[i][2]);

            if (data[i][2] < 18.5) {
                System.out.println("Status: Underweight");
            } else if (data[i][2] < 25) {
                System.out.println("Status: Normal");
            } else if (data[i][2] < 30) {
                System.out.println("Status: Overweight");
            } else {
                System.out.println("Status: Obese");
            }
        }

    }
}
