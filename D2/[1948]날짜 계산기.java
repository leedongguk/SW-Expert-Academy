import java.util.*;

class Solution {
	
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int T;
        T = sc.nextInt();
        
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int test_case = 1; test_case <= T; test_case++) {
        
        	int A1 = sc.nextInt();
        	int A2 = sc.nextInt();
        	
        	int B1 = sc.nextInt();
        	int B2 = sc.nextInt();
        	
        	int result = 0;
        	
        	if(A1 == B1) {
        		result = B2-A2+1;
        		
        	}else {
        		
        		result += month[A1 - 1] - A2 + 1;
        		result += B2;
            	for(int i=A1;i<B1-1;i++) {
            		result += month[i];
            	}
        		
        	}
        	
          System.out.println("#"+test_case+" "+result);
        	
           
        
        }
     
    
    
    }
   
    
    
}
