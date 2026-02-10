import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;              
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num > 0) {

            if (index == maxDigit) {
                int[] newArray = new int[maxDigit + 10];

                for (int i = 0; i < maxDigit; i++) {
                    newArray[i] = digits[i];
                }

                digits = newArray;
                maxDigit = maxDigit + 10;
            }

            digits[index] = num % 10;
            index++;
            num /= 10;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.print("\nDigits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
