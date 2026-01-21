import java.util.Scanner;
class discount
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("fees :-");
		int a = input.nextInt();
		double c = (a*10)/100;
		System.out.println("miles :-" +c);
	}
}