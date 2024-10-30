import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			double sum = 0;
			for(int i=0;i<10;i++) {
				int a = sc.nextInt();
				sum += a;
				
			}
			int result = (int)Math.round(sum/10);
			System.out.println("#"+test_case + " " + result);
		}
	}
}
