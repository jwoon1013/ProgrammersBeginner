import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
    //1. answer 의 길이는 commands.length
        int[] answer = new int[commands.length];
        //2. commandArray 는 array 의 commands[i][0]-1 인덱스 숫자부터 commands[i][1]-1 인덱스 숫자까지
        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0] - 1;
            int endIndex = commands[i][1] - 1;
            int answerIndex = commands[i][2] - 1;

            int[] commandArray = new int[endIndex - startIndex + 1];

            for (int j = 0; j < commandArray.length; j++) {
                commandArray[j] = array[startIndex + j];
            }
            // 3. commandArray 를 오름차순 정렬
            Arrays.sort(commandArray);
            // 4. commandArray 의 commands[i][2]-1 번째 숫자가 answer[i] 번째 수
            answer[i] = commandArray[answerIndex];

        }


        return answer;
    }
}