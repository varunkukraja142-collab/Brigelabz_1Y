import java.util.Scanner;
class StudentFees
{ 
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("student fees:- ");
		int a = input.nextInt();
		System.out.println("discount :- ");
		int b = input.nextInt();
		int c = a - (a * b/100);
		System.out.println("answer :- " +c);
	}
}