import java.util.Scanner;
class remainder
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number 1 :- ");
		int a = input.nextInt();
		System.out.println("number 2:- ");
		int b = input.nextInt();
		double c = a/b;
		double f = a%b;
		System.out.print("quotient :-\n" +c);
		System.out.print("reminder:- " +f);
		}
		}