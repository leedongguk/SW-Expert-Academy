import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] map = new int[100][100];
        
        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt(); // 농장의 크기
            int max = 0;
            int d;
            
            for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            
            // 가로 합
            for(int i = 0; i < 100; i++) {
                d = 0;
                for(int j = 0; j < 100; j++) {
                    d += map[i][j];
                }
                max = Math.max(max, d);
            }
            
            // 세로 합
            for(int i = 0; i < 100; i++) {
                d = 0;
                for(int j = 0; j < 100; j++) {
                    d += map[j][i];
                }
                max = Math.max(max, d);
            }
            
            // 왼쪽에서 오른쪽 대각선 합
            d = 0;
            for(int i = 0; i < 100; i++) {
                d += map[i][i];
            }
            max = Math.max(max, d);
            
            // 오른쪽에서 왼쪽 대각선 합
            d = 0;
            for(int i = 0; i < 100; i++) {
                d += map[i][99 - i];
            }
            max = Math.max(max, d);
            
            System.out.println("#" + test_case + " " + max);
        }
    }
}
