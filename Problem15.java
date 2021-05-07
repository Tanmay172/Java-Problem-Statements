import java.util.*;
class Golf
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int N[] = new int[n];
		int x[] = new int[n];
		int K[] = new int[n];
		String str[] = new String[n];
		for(int i=0;i<n;i++)
		{
			N[i] = scan.nextInt();
			x[i] = scan.nextInt();
			K[i] = scan.nextInt();
			for(int j=0;j<=N[i];j+=K[i])
			{
				if(x[i] == j)
				{
					str[i] = "YES";
				}
				else
				{
					str[i] = "NO";
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
	}
}