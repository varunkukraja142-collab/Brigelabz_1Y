import java.util.Scanner;
class distance
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("distance im feet :- ");
		int a = input.nextInt();
		double c = a/3;
		double f = c/1760;
		System.out.print("distance in yards :-\n" +c);
		System.out.print("distance in mile :- " +f);
		}
		}