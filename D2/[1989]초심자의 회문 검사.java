import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
     
        
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        	
        	String a = sc.next();
        	StringBuffer sb = new StringBuffer(a);
        	String b = sb.reverse().toString();
        	
        	if(a.equals(b)) {
        		System.out.println("#"+ test_case + " 1");
        	}
        	else {
        		System.out.println("#"+ test_case + " 0");
        	}
        
        	
        }
    }
}
