import java.util.*;

class Solution {
    
    static int maxResult;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력

        for (int test_case = 1; test_case <= T; test_case++) {
            String number = sc.next();
            int count = sc.nextInt(); // 교환 횟수

            char[] map = number.toCharArray();
            maxResult = 0;

            // DFS를 이용하여 최대 교환 결과 탐색
            dfs(map, count, 0);

            System.out.println("#" + test_case + " " + maxResult);
        }

        sc.close();
    }

    // DFS를 통해 모든 가능한 교환 경우를 탐색하여 최대값 찾기
    static void dfs(char[] map, int count, int start) {
        // 교환 횟수를 모두 소진했을 때, 현재 숫자가 최대값인지 확인
        if (count == 0) {
            int currentValue = Integer.parseInt(new String(map));
            maxResult = Math.max(maxResult, currentValue);
            return;
        }

        int length = map.length;
        
        // start 위치부터 교환을 시작해 모든 조합을 탐색
        for (int i = start; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                // i와 j 위치의 값을 교환
                swap(map, i, j);
                // 교환한 후 재귀 호출로 다음 교환을 진행
                dfs(map, count - 1, i);
                // 원래 상태로 되돌림
                swap(map, i, j);
            }
        }
        
        // 교환 횟수가 남았는데 최적 상태라면, 마지막 자리에서 중복 교환
        if (count % 2 == 1) {
            swap(map, length - 1, length - 2);
            int currentValue = Integer.parseInt(new String(map));
            maxResult = Math.max(maxResult, currentValue);
            swap(map, length - 1, length - 2); // 다시 원래 상태로
        }
    }

    // 두 위치의 값을 교환하는 메소드
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
