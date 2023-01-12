class Solution {
    public int solution(int[] d, int budget) {
         //0. 확정예산 총합 total
        int total = 0;
        int answer = 0;

        //1. int [] d 를 오름차순으로 정렬
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i] > d[j]) {
                    int num = d[i];
                    d[i] = d[j];
                    d[j] = num;
                }
            }
        }

        //2. 오름차순 정렬한 d[i] 하나씩 total에 더해
        for (int i = 0; i < d.length; i++) {
            // 3. 계속더해
            total = total + d[i];
            //4. total 이 budget 보다 크면 멈추고, answer = i-1(전전값) // total == budget 이면 answer = i(전값)
            if (total == budget) {
                answer = i+1;
                return answer;
            }
            if (total > budget) {
                answer = i;
                return answer;
            }

        }
        // 5. 다 돌았는데 안나와?
        answer = d.length; // 아 이걸 안했네 역시 디버그를 해서 어디에 뭐가 들어가나 봐야함 ^^ㅎㅎ;;
        return answer;
    }
}