import  java.util.Scanner;
class Q3
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int a;
		System.out.println("multiplication number :- ");
		a = sc.nextInt();
		
		for(int i=1;i<11;i++){
		int b;
		b = a * i;
		System.out.println(a + "X" + i + "=" + b);
		}
		}
		}