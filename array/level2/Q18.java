import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = (total / 300.0) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

    }
}
