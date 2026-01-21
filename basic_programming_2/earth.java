import java.util.Scanner;
class earth
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("radius in km :-");
		int r = input.nextInt();
		System.out.println("radius in miles :-");
		int k = input.nextInt();
		double c = (3/4)*r*r*r*3.14;
		double d = (3/4)*k*k*k*3.14;
		System.out.println("earth voulume in km :-" +c);
		System.out.println("earth voulume in miles :-" +d);
	}
}