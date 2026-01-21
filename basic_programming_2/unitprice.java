import java.util.Scanner;
class unitprice
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("unit price :- ");
		int a = input.nextInt();
		System.out.println("number of units:- ");
		int b = input.nextInt();
		double c = a * b;
		System.out.print("total price :-\n" +c);
		}
		}