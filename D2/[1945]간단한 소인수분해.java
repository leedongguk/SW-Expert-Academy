import java.util.*;

class Solution {
	
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        long T;
        int [] array = new int [5];
        int map[] = {2,3,5,7,11};
        T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
        
        	double a = sc.nextLong();
        	
        	for(int i=0;i<5;i++) {
        		int count = 0;
        		while(true) {
        			
        			if(a%map[i]==0) {
        				a = a/map[i];
        				count++;
        			}
        			else {
        				array[i] = count;
        				break;
        			}
        			
        		}
        		
        		
        	}
        	System.out.print("#"+test_case);	
        for(int i=0;i<5;i++) {
        	 System.out.print(" "+array[i]);	
        }
        System.out.println("");
        	
           
        
        }
     
    
    
    }
   
    
    
}
