import java.util.*;
class Solubility
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int X[] = new int[n];
		int A[] = new int[n];
		int B[] = new int[n];
		int maxSugar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			X[i] = scan.nextInt();
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			maxSugar[i] = (A[i] + (100-X[i])*B[i])*10;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(maxSugar[i]);
		}
	}
}