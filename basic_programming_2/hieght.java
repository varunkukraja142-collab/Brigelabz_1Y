import java.util.Scanner;
class  hieght
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("your hieght");
		int a = input.nextInt();
		double c = a / 2.54;
		double b = c / 12;
		System.out.println("height in feet:- " +b);
		System.out.println("hieght in inch :- " +c);
		}
		}