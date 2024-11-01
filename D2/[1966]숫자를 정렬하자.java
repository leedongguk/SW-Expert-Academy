import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
     
        
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        

        	int m = sc.nextInt();
        	int[] n = new int[m];
        	
        	for(int i=0;i<m;i++) {
        		n[i] = sc.nextInt();
        	}
        	Arrays.sort(n);
        	
        	System.out.print("#"+test_case+" ");
        	for(int i=0;i<m;i++) {
        		System.out.print(n[i]+ " ");
        	}
        	System.out.println("");
        	
        }
     
    
    
    }
}
