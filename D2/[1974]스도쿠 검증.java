import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        int[][] map = new int[9][9];

        for (int test_case = 1; test_case <= T; test_case++) {
            int a = 1; // 스도쿠 유효성 검사 결과 (1: 유효, 0: 무효)

            // 9x9 스도쿠 입력 받기
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            // 각 행 유효성 검사
            for (int i = 0; i < 9; i++) {
                int[] check = new int[9];
                for (int j = 0; j < 9; j++) {
                    check[map[i][j] - 1]++;
                }
                for (int j = 0; j < 9; j++) {
                    if (check[j] != 1) {
                        a = 0;
                        break;
                    }
                }
                if (a == 0) break;
            }

            // 각 열 유효성 검사
            if (a == 1) {
                for (int i = 0; i < 9; i++) {
                    int[] check = new int[9];
                    for (int j = 0; j < 9; j++) {
                        check[map[j][i] - 1]++;
                    }
                    for (int j = 0; j < 9; j++) {
                        if (check[j] != 1) {
                            a = 0;
                            break;
                        }
                    }
                    if (a == 0) break;
                }
            }

            // 3x3 격자 유효성 검사
            if (a == 1) {
                for (int row = 0; row < 9; row += 3) {
                    for (int col = 0; col < 9; col += 3) {
                        int[] check = new int[9];
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                check[map[row + i][col + j] - 1]++;
                            }
                        }
                        for (int j = 0; j < 9; j++) {
                            if (check[j] != 1) {
                                a = 0;
                                break;
                            }
                        }
                        if (a == 0) break;
                    }
                    if (a == 0) break;
                }
            }

            System.out.println("#" + test_case + " " + a);
        }
        sc.close();
    }
}
