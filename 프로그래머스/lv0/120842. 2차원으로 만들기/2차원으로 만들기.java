class Solution {
    public int[][] solution(int[] num_list, int n) {
        int answerSize = num_list.length / n;
        int[][] answer = new int[answerSize][];
        for (int i = 0; i < answerSize; i++) {
            answer[i] = new int[n];
            for (int j = 0; j < n; j++) {
                int element = num_list[i * n + j];
                answer[i][j] = element;
            }
        }


        return answer;
    }
}