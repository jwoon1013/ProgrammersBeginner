class Solution {
    public int[] solution(int n, int m) {
        //1. n m 중에 큰거 찾기 big small
        //2. big % small != 0 이면 big = small , small = (int)(bigsmall)
        //3. big % small == 0 이면 answer {small, n * m / small }
        int big;
        int small;
        if (n > m) {
            big = n;
            small = m;
        } else {
            big = m;
            small = n;
        }

        while (big % small != 0) {
            int a = big % small;
            big = small;
            small = a;
        }
        long b = (long) n * m / small;
        return new int[]{small, (int) b};
    }
}