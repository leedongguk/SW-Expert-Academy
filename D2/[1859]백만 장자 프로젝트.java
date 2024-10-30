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
			int N = sc.nextInt();
			int[] Array = new int[N];

			for(int i=0;i<N;i++) {
				Array[i] = sc.nextInt();
			}
			
			int Max = Array[N-1];
			int total =0;
			for(int i = N-2; i>=0; i--) {
				if(Array[i] < Max) {
				total += (Max-Array[i]);
				}else {
					Max = Array[i];
				}
			}
			
			System.out.println("#" + test_case + " " + total);
			
		}
			
	}
	

	
	
}

