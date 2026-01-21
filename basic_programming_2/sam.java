import java.util.Scanner;
class sam 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("marks of maths");
		int a = input.nextInt();
		System.out.println("marks of physics");
		int b = input.nextInt();
		System.out.println("marks of chem");
		int c = input.nextInt();
		int d = (a+b+c)/3;
		System.out.println("average :-" +d);
		}
		}