import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("\nReversed number: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

    }
}
