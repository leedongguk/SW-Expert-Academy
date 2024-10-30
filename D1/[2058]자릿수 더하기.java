import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		//for(int test_case = 1; test_case <= T; test_case++)
		//{
		//	array[test_case-1] = sc.nextInt();
		//}
		int length = (int)(Math.log10(T)+1);
		int sum = 0;
		for(int i=0;i<length;i++) {
			sum += T % 10;
			T = T/10;
		}
		System.out.println(sum);

	}
}
