import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
            // 1. 1~0까지 다 있는 비교 배열 만듬
        int[] criteria = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // 2. criteria의 합을 구함
        int criteriaSum = Arrays.stream(criteria).sum();

        //3. numbers의 합을 구함
        int numberSum = Arrays.stream(numbers).sum();
        // 4. answer = criteria - numbers
        int answer = criteriaSum - numberSum;


        return answer;
        
        
       
    }
}