class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] Array = new int[N][N];

            // 첫 번째 줄 초기화
            Array[0][0] = 1;
            for (int i = 1; i < N; i++) {
                Array[i][0] = 1; // 각 줄의 첫 번째 값은 1
                Array[i][i] = 1; // 각 줄의 마지막 값도 1
            }

            // 두 번째 줄부터 값 계산
            for (int i = 2; i < N; i++) {
                for (int j = 1; j < i; j++) {
                    Array[i][j] = Array[i - 1][j] + Array[i - 1][j - 1];
                }
            }

            // 결과 출력
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j > 0) {
                        System.out.print(" "); // 숫자 사이에 공백 추가
                    }
                    System.out.print(Array[i][j]);
                }
                System.out.println(); // 줄바꿈
            }
        }

        sc.close();
    }
}
