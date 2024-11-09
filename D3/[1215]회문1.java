import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt(); // 찾을 회문의 길이
            char[][] farm = new char[8][8];
            int count = 0;
            
            // 글자판 입력 받기
            for (int i = 0; i < 8; i++) {
                String row = sc.next(); // 각 행을 문자열로 입력받음
                for (int j = 0; j < 8; j++) {
                    farm[i][j] = row.charAt(j);
                }
            }
            
            // 가로로 회문 검사
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - N; j++) {
                    StringBuffer check = new StringBuffer();
                    for (int k = 0; k < N; k++) {
                        check.append(farm[i][j + k]);
                    }
                    if (check.toString().equals(check.reverse().toString())) {
                        count++;
                    }
                }
            }
            
            // 세로로 회문 검사
            for (int j = 0; j < 8; j++) {
                for (int i = 0; i <= 8 - N; i++) {
                    StringBuffer check = new StringBuffer();
                    for (int k = 0; k < N; k++) {
                        check.append(farm[i + k][j]);
                    }
                    if (check.toString().equals(check.reverse().toString())) {
                        count++;
                    }
                }
            }

            // 출력 형식에 맞게 결과 출력
            System.out.println("#" + test_case + " " + count);
        }

        sc.close();
    }
}
