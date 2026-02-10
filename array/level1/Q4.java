import java.util.Scanner;
class Q4{
    public static void main(String...args) {

        int[] arr = new int[10];
        int count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (0 or negative number to stop):");

        while (count < 10) {
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }

            arr[count] = num;
            sum += num;
            count++;
        }

        System.out.println("\nStored numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nSum of all numbers: " + sum);
    }
}
