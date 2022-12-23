import java.util.Arrays;

class Solution {
    
    public boolean solution(int x) {
        boolean answer;
        // 1. x를 자릿수만큼 잘라서 배열 cipherNumbers 에 담어.
        String[] strings = String.valueOf(x).split("");
        int[] cipherNumbers = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        // 2. ciPherNumber 다 더한 값 cipherNumbersSum
        int cipherNumbersSum = Arrays.stream(cipherNumbers).sum();
        // 3. x % cipherNumbersSum = 0 ?해서 T/F 정해서 출력
        answer = x % cipherNumbersSum == 0;


        return answer;
    }
}