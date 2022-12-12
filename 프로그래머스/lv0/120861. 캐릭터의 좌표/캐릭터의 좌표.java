import static java.lang.Math.abs;
class Solution { public int[] solution(String[] keyinput, int[] board) {
        int xAnswer = 0; // 캐릭터의 최종 x값
        int yAnswer = 0; // 캐릭터의 최종 y값

        int xLimit = (board[0] - 1) / 2; // x의 한계절대값
        int yLimit = (board[1] - 1) / 2; // y의 한계절대값


        for (int i =0 ; i < keyinput.length; i++) {
            String step = keyinput[i];
            switch(step) {
                case "up" :
                    yAnswer += 1;
                    if (abs(yAnswer)>yLimit){
                        yAnswer-=1;
                    }
                    break;
                case "down" :
                    yAnswer -= 1;
                    if (abs(yAnswer)>yLimit){
                        yAnswer+=1;
                    }
                    break;
                case "left" :
                    xAnswer -= 1;
                    if (abs(xAnswer)>xLimit){
                        xAnswer+=1;
                    }
                    break;
                case "right" :
                    xAnswer += 1;
                    if (abs(xAnswer)>xLimit){
                        xAnswer-=1;
                    }

            }




        } // for 문 종료


        int[] answer = {xAnswer, yAnswer};
        return answer;
    }
}