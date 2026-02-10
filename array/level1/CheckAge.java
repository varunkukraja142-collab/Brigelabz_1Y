import java.util.Scanner;
class CheckAge
{
	public static void main(String...args)
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int [10];
		int target = 18;
		int count = 0;
		for(int i=0;i<10;i++){
		System.out.println("student " + i);
		arr[i] = input.nextInt();
		}
		
		for(int k=0;k<10;k++){
		if(arr[k]<=target){
		count = count + 1;
		System.out.println("(" + "student" + k + "=" + arr[k] + ")");
		}
		}
		}
		}