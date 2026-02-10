import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players in the team: ");
        int n = sc.nextInt();

        double[] heights = new double[n];

        System.out.println("Enter the heights of players (in cm):");
        for (int i = 0; i < n; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += heights[i];
        }

        double mean = sum / n;

        System.out.println("\nMean (average) height of the players: " + mean + " cm");
    }
}
