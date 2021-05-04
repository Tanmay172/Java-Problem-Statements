import java.util.*;
class MainClass
{
	public static void main(String arg[])
	{
		int T,i,w1,w2,x1,x2,M,M1,M2;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		int count[] = new int[T];
		for(i=0;i<T;i++)
		{
			w1=scan.nextInt();
			w2=scan.nextInt();
			x1=scan.nextInt();
			x2=scan.nextInt();
			M=scan.nextInt();
			int W = w2-w1;
			M1 = 1*M;
			M2 = 2*M;
			if(M1<=W && W<=M2)
			{
				count[i] = 1;
			}
			else
			{
				count[i] = 0;
			}
		}
		for(i=0;i<T;i++)
		{
			System.out.println(count[i]);
		}
	}
}