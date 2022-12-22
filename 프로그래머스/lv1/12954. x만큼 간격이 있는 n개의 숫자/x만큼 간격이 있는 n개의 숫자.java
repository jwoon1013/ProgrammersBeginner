class Solution {
    public long[] solution(int x, int n) {
        // X에 0 ~ N 까지 곱한 숫자를 리스트에 넣음
        long[] answer = new long[n];
        // (x=2, n=5)
        // answer = [2,4,6,8,10]
        // (x=-4, n=2)
        // answer = [-4, -8]
        for (int i = 1; i <= n ; i ++){
            answer[i-1] = (long) x * i ;
        }

        return answer;
    }
}