import java.util.Scanner;
class grade
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number of students :- ");
		int a = input.nextInt();
		for(int i=0;i<=a;i++)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("marks of student :- ");
			int b = input.nextInt();
			for(int j=0;j<=b;j++)
			{
				if(b<50)
				{
					System.out.println("fail :-");
					}
				else if(marks>=60 && marks<50)
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