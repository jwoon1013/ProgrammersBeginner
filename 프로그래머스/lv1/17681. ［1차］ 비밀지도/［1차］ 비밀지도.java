import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //1. arr1&2 숫자 하나씩 꺼내서 2진수화하기 arrMap1&2
        String[] arrMap1 = new String[n];
        for(int i = 0 ; i < n; i++){
            arrMap1[i] = Integer.toBinaryString(arr1[i]);
        }

        String[] arrMap2 = new String[n];
        for(int i =0; i < n ; i ++){
            arrMap2[i] = Integer.toBinaryString(arr2[i]);
        }

        //2. arrMap1&2 에 든 2진수 값이 n자리가 되도록 만들기. ex) n이 5일때, (2진수)10 >> "00010" 으로
        for (int i = 0 ; i < n ; i ++){
            arrMap1[i] = String.format("%"+n+"s",arrMap1[i]).replace(" ","0"); // 지금 여기서 포멧에 문제가 있음!!
        }
        for (int i = 0 ; i < n ; i ++){
            arrMap2[i] = String.format("%"+n+"s",arrMap2[i]).replace(" ","0");
        }


        //3, arrMap1[i][0~n] arrMap2[i][0~n] 서로 비교해서 1 하나라도 있으면 # , 둘다 0이면 ""인 식으로 answer만듬.
        String[] answer = new String[n];

        for(int i = 0; i < n ; i ++) {
        String[] oneLine = new String[n];
            for (int j = 0; j < n; j++) {
                if (arrMap1[i].split("")[j].equals("1") || arrMap2[i].split("")[j].equals("1")){
                    oneLine[j]="#";
                }
                if(arrMap1[i].split("")[j].equals("0")&&arrMap2[i].split("")[j].equals("0")){
                    oneLine[j]=" ";
                }

            }
            answer[i] = Arrays.toString(oneLine);
            answer[i] = answer[i].replaceAll("\\[", "");
            answer[i] = answer[i].replaceAll("\\]", "");
            answer[i] = answer[i].replaceAll(", ", "");
        }

        return answer;
    }
}