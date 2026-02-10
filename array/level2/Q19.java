import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
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

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
        }

    }
}
