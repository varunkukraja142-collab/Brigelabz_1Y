import java.util.Scanner;
class penandstudent
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number of pens :- ");
		int a = input.nextInt();
		System.out.println("number of students:- ");
		int b = input.nextInt();
		double c = a/b;
		double f = a%b;
		System.out.print("per pen student :-\n" +c);
		System.out.print("not distributed:- " +f);
		}
		}