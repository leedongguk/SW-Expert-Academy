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
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			String result;
			if(a<b) {
				result = "<";
			}
			else if(a == b) {
				result = "=";
			}
			else {
				result=">";
			}
			
			System.out.println("#"+test_case + " " + result);
		}
	}
}
