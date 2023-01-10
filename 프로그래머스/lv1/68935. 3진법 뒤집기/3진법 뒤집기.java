import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
 int answer = 0;
        // 1. n을 3진법 만들어서 list에 넣기
        List<Integer> ternary = new ArrayList<>();
        while (n != 0) {
            ternary.add(n % 3);
            n /= 3;
        }
        System.out.println(ternary.toString());
        for (int i = 0; i < ternary.size(); i++) {
            answer = answer + (int)Math.pow(3, ternary.size()-1-i) * ternary.get(i);

        }
        return answer;
    }
}