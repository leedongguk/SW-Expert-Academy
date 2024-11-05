import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int maxResult = Integer.MIN_VALUE; // 최댓값을 저장할 변수

            // a 배열이 짧고 b 배열이 길 경우
            if (n <= m) {
                for (int i = 0; i <= m - n; i++) {
                    int currentSum = 0;
                    for (int j = 0; j < n; j++) {
                        currentSum += a[j] * b[i + j];
                    }
                    maxResult = Math.max(maxResult, currentSum);
                }
            } 
            // b 배열이 짧고 a 배열이 길 경우
            else {
                for (int i = 0; i <= n - m; i++) {
                    int currentSum = 0;
                    for (int j = 0; j < m; j++) {
                        currentSum += a[i + j] * b[j];
                    }
                    maxResult = Math.max(maxResult, currentSum);
                }
            }

            System.out.println("#" + test_case + " " + maxResult);
        }
        sc.close();
    }
}
