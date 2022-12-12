import java.util.Arrays;
class Solution {     
      public double makeSlope (int[] dot1, int[] dot2){
        // 두 점의 기울기 구하는 함수 : (y값차이) / (x값 차이)
        return  ((double)(dot2[1] - dot1[1]) / (double)(dot2[0]-dot1[0]));
    }

    public int solution(int[][] dots) {
        double[] answerArray = new double[6];
        int answer;

        answerArray[0] = makeSlope(dots[0], dots[1]);
        answerArray[1] = makeSlope(dots[0], dots[2]);
        answerArray[2] = makeSlope(dots[0], dots[3]);
        answerArray[3] = makeSlope(dots[1], dots[2]);
        answerArray[4] = makeSlope(dots[1], dots[3]);
        answerArray[5] = makeSlope(dots[2], dots[3]);

        int counter = (int)(Arrays.stream(answerArray).distinct().count());
        if (counter == answerArray.length){
            answer = 0;
        } else {
            answer = 1;
        }

        return answer;
    }
}