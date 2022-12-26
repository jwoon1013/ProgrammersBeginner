import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
                List<Integer> answerList = new ArrayList<>();
        //1 arr 에 있는 수 중 divisor 로 나누어 떨어지는 수를 answerList 에 넣자
        for (int i = 0; i < arr.length; i ++){
            if ( arr[i] % divisor == 0 ){
                answerList.add(arr[i]);
            }
        }
        //2 answer 을 오름차순 정렬해서 배열생성
        Collections.sort(answerList);
        if(answerList.size() == 0){
            int emptyList = -1;
            answerList.add(emptyList);
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}