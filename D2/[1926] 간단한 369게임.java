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
			String f = Integer.toString(test_case);
			int count = 0;
			for(int i=0;i<f.length();i++) {
				if((f.charAt(i) == '3') || (f.charAt(i) == '6') || (f.charAt(i) == '9')) {
					count++;
				}
			}
			
			if(count>0) {
				for(int i=0;i<count;i++) {
					System.out.print("-");
				}
			}
			else {
				System.out.print(f);
			}
			
			System.out.print(" ");
			
			
			
	    }
	}
	

	
	
}
