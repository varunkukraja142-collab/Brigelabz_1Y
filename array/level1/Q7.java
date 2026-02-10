import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] even = new int[n];
        int[] odd = new int[n];

        int eCount = 0, oCount = 0;
		
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[eCount] = i;
                eCount++;
            } else {
                odd[oCount] = i;
                oCount++;
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oCount; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\n\nEven numbers:");
        for (int i = 0; i < eCount; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
