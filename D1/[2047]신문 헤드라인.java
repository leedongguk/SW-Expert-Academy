import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		//int T;
		//T=sc.nextInt();
		//for(int test_case = 1; test_case <= T; test_case++)
		//{
		//}
		
		String a = sc.next();
		
		for(int i=0;i<a.length();i++) {
		if( ((int)a.charAt(i)>=97) && ((int)a.charAt(i)<=122)) {
			System.out.print((char)((int)a.charAt(i)-32));
		}		else {
			System.out.print(a.charAt(i));
		}
		}

	
	}
}
