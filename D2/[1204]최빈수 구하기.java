import java.util.*;

class Solution {
	
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int T;
        T = sc.nextInt();
        int[] map = new int[1000];
        
        for (int test_case = 1; test_case <= T; test_case++) {
        	
        	int a = sc.nextInt();
        	
        	for(int i=0;i<1000;i++) {
        		map[i] = sc.nextInt();
        	}
        	
        	Arrays.sort(map);
        	
        	int count = 0;
        	int maxcount = 0;
        	int max = 0;
        	
        	
        	for(int i=1;i<1000;i++) {		
        		if(map[i]==map[i-1]) {
        			count++;
        		}else {
        			if(maxcount <= count) {
        			    maxcount = count;
        			    max = i-1;
        			}
        			 count = 0;
        		}
        		
        	}
        	
        System.out.println("#"+test_case+" "+map[max]);
        	
        	
        	
        	
        }
     
    
    
    }
   
    
    
}
