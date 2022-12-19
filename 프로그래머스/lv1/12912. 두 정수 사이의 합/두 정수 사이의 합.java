class Solution {
    public long solution(int a, int b) {
        // 1. a와 b 중에 어느 수가 더 큰지 찾기
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long answer = 0;
        // 2. min에서 max까지 모든 수 더해
        for (long i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}