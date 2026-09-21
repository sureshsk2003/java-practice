import java.util.Scanner;
class oddreverse
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter start");
		int start=scn.nextInt();
		System.out.println("enter end");
		int end=scn.nextInt();
		for(int i=end;i>=start;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
