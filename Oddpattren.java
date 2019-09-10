public class Oddpattren
{
	public static void main(String []args)
	{
		int n=0;
		for(int i=1;i<5;i++)
		{
			
			n+=i;
			for(int k=2*(5-i);k>=0;k--)
				System.out.print(" ");
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			n-=i;
			n++;

			System.out.println();
		}
	}
}
