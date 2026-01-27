import java.util.Scanner;
class grade
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number of students :- ");
		int a = input.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("marks of student :- ");
			int b = input.nextInt();
				if(b<50)
				{
					System.out.println("fail :-");
					}
				else if(b>=60 && b<50)
				{
					System.out.println("grade d :-");
					}
				else
				{
					System.out.println("pass :-");
					}
					}
					}
}