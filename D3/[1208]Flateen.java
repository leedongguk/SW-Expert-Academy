import java.util.*;

class Solution {
    


    public static void main(String args[]) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	
    	for(int i=0;i<10;i++) {
    		int N = sc.nextInt();
    		int[] map = new int[100];
    		
    		for(int j=0;j<100;j++) {
    			map[j] = sc.nextInt();
    		}
    		
    		for(int j=0;j<N;j++) {
    			Arrays.sort(map);
    			
    			map[0] += 1;
    			map[map.length-1] -= 1;
    			
    		}
    		 Arrays.sort(map);
    		 System.out.println("#" + (i+1) + " " + (map[map.length-1] - map[0]));
    		
    		
    		
    	}
        /*int T = sc.nextInt(); // 테스트 케이스 수 입력

        for (int test_case = 1; test_case <= T; test_case++) {


            System.out.println("#" + test_case + " " + maxResult);
        }
*/
    	
    	
    	
    }

}
