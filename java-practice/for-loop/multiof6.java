import java.util.Scanner;
class multiof6
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter start");
		int start=scn.nextInt();
		System.out.println("enter end");
		int end=scn.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%6==0)
			{
				System.out.println(i);
			}
		}
	}
}
