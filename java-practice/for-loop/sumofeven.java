import java.util.Scanner;
class sumofeven
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter start");
		int start=scn.nextInt();
		System.out.println("enter end");
		int end=scn.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}