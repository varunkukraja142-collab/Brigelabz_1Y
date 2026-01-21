import java.util.Scanner;
class handshake
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number of students :- ");
		int n = input.nextInt();
		double c = (n * (n - 1)) / 2;
		System.out.print("total number fo handshake :-\n" +c);
		}
		}