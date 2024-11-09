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
    

	static int maxScore;
	static int N, L;
	static int[] scores, calories;

    public static void main(String args[]) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
        int T = sc.nextInt(); // 테스트 케이스 수 입력

        for (int test_case = 1; test_case <= T; test_case++) {
        	
        	N = sc.nextInt();
        	L = sc.nextInt();
        	
        	scores = new int[N];
        	calories = new int[N];
        	
        	
        	for(int i=0;i<N;i++) {
        		scores[i] = sc.nextInt();
        		calories[i] =  sc.nextInt();
        	}
        	
        	maxScore = 0;
        	
        	dfs(0,0,0);
        	
        	System.out.println("#" + test_case + " " + maxScore);

        }
    	
    }
    
   
    
    static void dfs(int index, int currentScore, int currentCalories) {
    	
    	if(currentCalories > L) {
    		return;
    	}
    	
    	if(index == N) {
    		maxScore = Math.max(maxScore, currentScore);
    		return;
    	}
    	
    	dfs(index+1, currentScore + scores[index], currentCalories + calories[index]);
    	
    	dfs(index+1, currentScore, currentCalories);
    	
    	
    }

}
