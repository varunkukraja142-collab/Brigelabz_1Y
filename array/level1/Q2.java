import java.util.Scanner;
class Q2
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=1;i<6;i++){
		System.out.print("enter number " + i + ":-");
		arr[i] = sc.nextInt();
		
			if(arr[i]>0){
			System.out.println("positive");
				if(arr[i]%2==0){
				System.out.println("even");}
				else{
				System.out.println("odd");
		}
		}
			else if(arr[i]==0){
			System.out.println("zero");
		}
			else{
			System.out.println("negative");
		}
		}
		if(arr[0]<arr[4]){
		System.out.println("greater");
		}
		else if(arr[0]==arr[4]){
		System.out.println("equal");
		}
		else{
		System.out.println("smaller");
		}
		}
		}