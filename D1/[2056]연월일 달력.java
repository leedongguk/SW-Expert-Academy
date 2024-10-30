package Solution;

/////////////////////////////////////////////////////////////////////////////////////////////
//기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
//아래 표준 입출력 예제 필요시 참고하세요.
//표준 입력 예제
//int a;
//double b;
//char g;
//String var;
//long AB;
//a = sc.nextInt();                           // int 변수 1개 입력받는 예제
//b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
//g = sc.nextByte();                          // char 변수 1개 입력받는 예제
//var = sc.next();                            // 문자열 1개 입력받는 예제
//AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
//표준 출력 예제
//int a = 0;                            
//double b = 1.0;               
//char g = 'b';
//String var = "ABCDEFG";
//long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
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
			String var = sc.next();
			String years = var.substring(0,4);
			String month = var.substring(4,6);
			String day = var.substring(6,8);
			
			if(month.equals("02")) {
				if((Integer.parseInt(day) < 1) || (Integer.parseInt(day) > 28)) {
					System.out.println("#"+test_case+" "+"-1");
					continue;
				}
				else {
					System.out.println("#"+test_case+" "+years+"/"+month+"/"+day);
					continue;
				}
			}
			else if(month.equals("04")||month.equals("06")||month.equals("09")||month.equals("11")) {
				if((Integer.parseInt(day) < 1) || (Integer.parseInt(day) > 30)) {
					System.out.println("#"+test_case+" "+"-1");
					continue;
				}
				else {
					System.out.println("#"+test_case+" "+years+"/"+month+"/"+day);
					continue;
				}
				
			}
			else if(month.equals("01")||month.equals("03")||month.equals("05")||month.equals("07")||month.equals("08")||month.equals("10")||month.equals("12")) {
				if((Integer.parseInt(day) < 1) || (Integer.parseInt(day) > 31)) {
					System.out.println("#"+test_case+" "+"-1");
					continue;
				}
				else {
					System.out.println("#"+test_case+" "+years+"/"+month+"/"+day);
					continue;
				}
				
			}
			else {
				System.out.println("#"+test_case+" "+"-1");
				continue;
			}

			

		}

	}
}





