import java.util.Scanner;
class intopreation
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
		int d = a + b * c;
		int f = a * b + c;
		int h = c + a / b;
		int k = a % b + c;
		System.out.print("int opreation 1 :-\n" +d);
		System.out.print("int opreation 2 :- \n" +f);
		System.out.print("int opreation 3 :-\n" +h);
		System.out.print("int opreation 4 :- " +k);
		}
		}