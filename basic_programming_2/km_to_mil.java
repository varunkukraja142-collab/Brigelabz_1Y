import java.util.Scanner;
class km_to_mil
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("kilometers :-");
		int a = input.nextInt();
		double c = a * 1.6;
		System.out.println("miles :-" +c);
	}
}