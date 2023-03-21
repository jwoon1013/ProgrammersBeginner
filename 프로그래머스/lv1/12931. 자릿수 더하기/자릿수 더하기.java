import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while ( n > 0) {
            int number = n % 10;
            answer += number;
            n /= 10;
        }

        return answer;
    }
}