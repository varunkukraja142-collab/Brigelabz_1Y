import java.util.Scanner;
class areaoftraingle
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("hieght in inch :- ");
		int a = input.nextInt();
		System.out.println("base in inch:- ");
		int b = input.nextInt();
		double c = 1/2*(a * b);
		System.out.println("hieght in cm :- ");
		int d = input.nextInt();
		System.out.println("base in cm :- ");
		int e = input.nextInt();
		double f = 1/2*(d * e);
		System.out.print("area in inches :-\n" +c);
		System.out.print("area in cm :- " +f);
		}
		}