public class Pattren2
{
	public static void main(String []args)
	{
		int n=0;
		for(int i=1;i<5;i++)
		{
			
			n+=i;
			for(int k=2*(4-i);k>=0;k--)
				System.out.print(" ");
			for(int j=1;j<=n;j++)
			{
				if(i==4)
					System.out.print("_ ");
				else if(j==1)
					System.out.print("/ ");
				else if(i==j)
					System.out.print("| ");
				else if(j==n)
					System.out.print("\\ ");
				else
					System.out.print("  ");
			}
			n-=i;
			n++;

			System.out.println();
		}
	}
}
