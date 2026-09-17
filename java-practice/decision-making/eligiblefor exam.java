//Read attendance from a student
//If attendance is greater than/equal to the required percentage → display eligible for exam
//Else → display not eligible for exam
import java.util.Scanner;
class program3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark=scn.nextInt();
		if(mark>=85)
		{
			System.out.println("Your are eligible for exam");
		}
		else
		{
			System.out.println("your are not eligible for exam");
			
		}
	}
}