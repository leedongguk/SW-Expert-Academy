import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
     
        
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        
        	int[] array = new int[10];
        	for(int i=0;i<10;i++) {
        		array[i] = sc.nextInt();
        	}
        	Arrays.sort(array);
        	
        	float sum = 0;
        	for(int j=1;j<9;j++) {
        		sum += array[j];
        	}
        	
        	float av = sum/8;
        	
        	System.out.println("#"+test_case+" " + Math.round(av));
        }
    }
}
