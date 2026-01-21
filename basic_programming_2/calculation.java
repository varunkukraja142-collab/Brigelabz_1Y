import java.util.Scanner;
class calculation
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number 1 :- ");
		int a = input.nextInt();
		System.out.println("number 2 :- ");
		int b = input.nextInt();
		int c = a + b;
		int d = a - b;
		int e = a* b;
		int f = a / b;
		System.out.print("addition :- \n" +c);
		System.out.print("sub :- /n" +d);
		System.out.print("multiy :- /n" +e);
		System.out.print("division :- " +f);
		}
		}