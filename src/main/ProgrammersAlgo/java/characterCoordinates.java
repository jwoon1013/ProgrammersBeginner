// 캐릭터의 좌표
//board은 [가로 크기, 세로 크기] 형태로 주어집니다. board의 가로 크기와 세로 크기는 홀수입니다.
//[0, 0]은 board의 정 중앙에 위치합니다. 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
//board의 크기를 벗어난 방향키 입력은 무시합니다.
//0 ≤ keyinput의 길이 ≤ 50
//1 ≤ board[0] ≤ 99
//1 ≤ board[1] ≤ 99
//keyinput은 항상 up, down, left, right만 주어집니다.
//keyinput	                                    board	result
//["left", "right", "up", "right", "right"]	[11, 11]	[2, 1]
//["down", "down", "down", "down", "down"]	[7, 9]	[0, -4]

import static java.lang.Math.abs;

public class characterCoordinates {
    // 1. keyinput 에서 하나를 꺼낸다.
    // 2. answer 좌표평면 { x, y } / up y +1 / down y -1 / left x -1 / right x + 1 / 근데 board 크기 넘기면 무시.
    // 3. keyinput [ i ] : up / down / left / right 하게함.
    // 4. 3을할 때 board{x,y} 에서 x나 y값 최대치 넘어서면 행동 무시함.

    public int[] solution(String[] keyinput, int[] board) {
        int xAnswer = 0; // 캐릭터의 최종 x값
        int yAnswer = 0; // 캐릭터의 최종 y값

        int xLimit = (board[0] - 1) / 2; // x의 한계절대값
        int yLimit = (board[1] - 1) / 2; // y의 한계절대값


        for (int i = 0; i < keyinput.length; i++) {
            String step = keyinput[i];
            switch (step) {
                case "up":
                    yAnswer += 1;
                    if (abs(yAnswer) > yLimit) {
                        yAnswer -= 1;
                    }
                    break;
                case "down":
                    yAnswer -= 1;
                    if (abs(yAnswer) > yLimit) {
                        yAnswer += 1;
                    }
                    break;
                case "left":
                    xAnswer -= 1;
                    if (abs(xAnswer) > xLimit) {
                        xAnswer += 1;
                    }
                    break;
                case "right":
                    xAnswer += 1;
                    if (abs(xAnswer) > xLimit) {
                        xAnswer -= 1;
                    }

            }


        } // for 문 종료


        int[] answer = {xAnswer, yAnswer};
        return answer;
    }
}
