import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
     
        
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        
        	int N = sc.nextInt();
        	int sum = 0;
        	for(int i=1;i<=N;i++) {
        		if(i%2==1) {
        			sum+=i;
        		}
        		else {
        			sum-=i;
        		}
        	}
        	
        	System.out.println("#"+test_case+" " + sum);
        }
    }
}
