import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        // 1. Strings 에서 n번째 글자 하나씩 꺼내서 {char, n번째 String} 형태로 리스트 charForOrder 에 담음. 예시 : [{a,apple}, {c,car}, {b,bed} ]
        String[][] charForOrder = new String[strings.length][2];
        for(int i = 0; i < strings.length; i++){
            charForOrder[i][0] = String.valueOf(strings[i].charAt(n));
            charForOrder[i][1] = strings[i];
        }

        // 2. charForOrder[i](0)의 값에 따라 정렬시킴. 결과 예시 : [{a,apple}, {b,bed}, {c,car}] << 이게 일단 되나 해봐야함. : 됨
        Arrays.sort(charForOrder, (o1, o2) -> {
           if(o1[0].equals(o2[0])){
               // (1) [0] 이 같은경우 : [1] 끼리 비교 compareTo 쓰는거같음...? 아마도...
                    for(int i =0; i < o1[1].length(); i++){
                        if(o1[1].compareTo(o2[1]) > 0){
                            return 1;
                        } else if(o1[1].compareTo(o2[1]) < 0){
                            return -1;
                        }
                    }

           } else{
               // (2) [0] 이 다른경우 : [0] 끼리 비교
               if(o1[0].compareTo(o2[0]) > 0){
                   return 1;
               } else if(o1[0].compareTo(o2[0]) < 0){
                   return -1;
           }
        }
            return 0; // 이건 왜있는지 모르겠음... 근데 이거 안하면 에러남. >> 이유 :  비교결과가 3가지 1. 왼쪽꺼가 크다 2. 오른쪽꺼가 크다 3. 두값이 같을때
        });

            // 3. charForOrder[i](1)의 값만 담긴 answer 출력
        String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++){
            answer[i] = charForOrder[i][1];
        }
        return answer;
    }
}
