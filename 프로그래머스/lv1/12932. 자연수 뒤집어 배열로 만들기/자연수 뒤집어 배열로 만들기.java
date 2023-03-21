import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}