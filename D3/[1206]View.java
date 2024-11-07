import java.util.*;

class Solution {
	
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        
       /* int T;
        T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
        	
        	int N = sc.nextInt();
        	
        }
     */
        
        for(int i=1;i<=10;i++) {
        	int T = sc.nextInt();
        	int[] map = new int[T];
        	
        	for(int j=0;j<T;j++) {
        		map[j]=sc.nextInt();
        	}
        	int count = 0;
        	for(int j=2;j<T-2;j++) {
                int max = Math.max(Math.max(map[j - 1], map[j + 1]), Math.max(map[j - 2], map[j + 2]));

                // 현재 건물이 양옆 건물들보다 높다면 조망권 확보
                if (map[j] > max) {
                    count += map[j] - max;
                }
        	}
        	System.out.println("#"+i+" "+count);
        }
    
    
    }
   
    
    
}
