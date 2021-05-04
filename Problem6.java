import java.util.*;
class MainClass
{
	public static void main(String arg[])
	{
		int T,i;
		String replaceStr;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		String S[] = new String[T];
		for(i=0;i<T;i++)
		{
			S[i] = scan.next();
		}
		for(i=0;i<T;i++)
		{
			replaceStr = S[i].replace("party","pawri");
			System.out.println(replaceStr);
		}
	}
}