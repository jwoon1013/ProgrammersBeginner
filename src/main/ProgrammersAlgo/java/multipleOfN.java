//n의 배수 고르기 문제
import java.util.Arrays;

public class multipleOfN {

    public static int[] solution(int n, int[] numlist) {
        int[] answer = Arrays.stream(numlist).filter(i -> i % n == 0).toArray();


        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {1,2,3,4,5,6,7,8,9,10};


        int[] answer = Arrays.stream(solution(n,numlist)).toArray();
    }





}
