import java.util.Scanner;
class doubleopreation
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number 1 :- ");
		int a = input.nextInt();
		System.out.println("number 2:- ");
		int b = input.nextInt();
		System.out.println("number 3:- ");
		int c = input.nextInt();
		double d = a + b * c;
		double f = a * b + c;
		double h = c + a / b;
		double k = a % b + c;
		System.out.print("int opreation 1 :-\n" +d);
		System.out.print("int opreation 2 :- \n" +f);
		System.out.print("int opreation 3 :-\n" +h);
		System.out.print("int opreation 4 :- " +k);
		}
		}