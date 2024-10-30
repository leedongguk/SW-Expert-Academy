import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        	
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] Array = new int[N][N];
        
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		Array[i][j] = sc.nextInt();
        	}
        }
        
        int max = 0;
        for(int i=0;i<=N-M;i++) {
        	for(int j=0;j<=N-M;j++) {
        		int sum =0;
        		
        		for(int a=i;a<i+M;a++) {
            		for(int b=j;b<j+M;b++) {
            			sum += Array[a][b];
            		}
        		}
        		if(sum >= max) {
        			max = sum;
        		}
        		
        	}
        }
        
        System.out.println("#"+test_case+" "+max);
        
        	
        }

        sc.close();
    }
}
