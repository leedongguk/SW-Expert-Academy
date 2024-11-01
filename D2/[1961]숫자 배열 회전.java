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

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
     
        
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        

        	int m = sc.nextInt();
        	int[][] n = new int[m][m];
        	int[][] n90 = new int[m][m];
        	int[][] n180 = new int[m][m];
        	int[][] n270 = new int[m][m];
        	
        	for(int i=0;i<m;i++) {
        		for(int j=0;j<m;j++) {
        			n[i][j] = sc.nextInt();
        		}
        	}
        	
        	for(int i=0;i<m;i++) {
        		for(int j=0;j<m;j++) {
        			n90[i][j] = n[m-j-1][i];
        		}
        	}
        	
        	for(int i=0;i<m;i++) {
        		for(int j=0;j<m;j++) {
        			n180[i][j] = n[m-i-1][m-j-1];
        		}
        	}
        	
        	for(int i=0;i<m;i++) {
        		for(int j=0;j<m;j++) {
        			n270[i][j] = n[j][m-i-1];
        		}
        	}
        	
        	System.out.println("#"+test_case);
        	for(int i =0;i<m;i++) {
        		for(int j=0;j<m;j++) {
        			System.out.print(n90[i][j]);
        		}
        		System.out.print(" ");
        		for(int j=0;j<m;j++) {
        			System.out.print(n180[i][j]);
        		}
        		System.out.print(" ");
        		for(int j=0;j<m;j++) {
        			System.out.print(n270[i][j]);
        		}
        		System.out.println("");
        	}
        	
        	


        }
     
    
    
    }
}
