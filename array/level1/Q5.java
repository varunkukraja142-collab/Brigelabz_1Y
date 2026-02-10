import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nMultiplication table of " + num + " (from 6 to 9):");

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
