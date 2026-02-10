import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        double[] salary = new double[n];
        int[] years = new int[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of Service: ");
            years[i] = sc.nextInt();

            if (years[i] >= 5) {
                bonus[i] = salary[i] * 0.10;   // 10% bonus
            } else {
                bonus[i] = salary[i] * 0.05;   // 5% bonus
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
        }

        System.out.println("\n--- Zara Employee Bonus Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        System.out.println("Total Bonus paid by Zara: " + totalBonus);
    }
}
