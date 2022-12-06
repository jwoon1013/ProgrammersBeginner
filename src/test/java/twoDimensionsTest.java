import static org.junit.jupiter.api.Assertions.*;

class twoDimensionsTest {

    public static int[][] solution(int[] num_list, int n) {
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

    public static void main(String[] args) {
        int[] test_list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};



    }
}

