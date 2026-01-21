import java.util.Scanner;
class profit
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("cost :-");
		int a = input.nextInt();
		System.out.println("selling :-");
		int b = input.nextInt();
		int c = b-a;
		double d = (c/a)*100;
		System.out.println("profit :-" +c);
		System.out.println("percentage :-" +d);
	}
}