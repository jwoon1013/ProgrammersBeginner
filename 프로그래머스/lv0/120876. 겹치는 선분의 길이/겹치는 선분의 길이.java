class Solution {
    public int solution(int[][] lines) {
               //1.계산용 수평선(parallelline) 만들기 -100 ~ 100 -> 0 ~ 200 (모든 수 +100)
        int [] parallelLine = new int[200];

        //2. lines에서 line 하나씩 꺼내. 수평선에 넣어. 그런데 line의 오른쪽 젤끝 수는 +1 안함.
        for (int j = 0; j < 3 ; j ++){
            int[] line = lines[j]; // 예시 [-1,1]
            for (int i = line[0]; i < line[1]; i++){
                parallelLine[ i + 100] += 1; // 예시 parallelLine[99],[100]이 +1 됨. [101]은 재낌.
            }

        }

        //3.parallelLine 원소 중 값이 2, 3인 애 개수 세. >> 이거 아닌듯. 인덱스로 빼야하는듯? ...를 어케함?
         // 엄청 간단한 방법이 있었음. 2 에서 그냥 [-1,1] 이면[99], [100] 만 +1 하고 [101]은 안하는 식으로!
        int answer = 0;
        for(int i = 0 ; i < parallelLine.length; i++){
            if(parallelLine[i] > 1){
                answer += 1;
            }
        }
        return answer;
    }
}
