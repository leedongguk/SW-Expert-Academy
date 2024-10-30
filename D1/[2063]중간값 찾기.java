import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] array = new int [T];
		for(int test_case = 1; test_case <= T; test_case++)
		{
			array[test_case-1] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[(T-1)/2]);
	}
}
