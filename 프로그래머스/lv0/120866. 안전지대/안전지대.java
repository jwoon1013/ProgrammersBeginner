import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        List<int[]>booms = new ArrayList<>();
        // 지뢰가 설치된 곳 주소 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    int[] yesBoom = {i,j};
                    booms.add(yesBoom);
                }
            }
        }

        // 지뢰가 설치된 곳 빙 둘러서 지뢰 설치
        int[] xDangerRange = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] yDangerRange = {-1, -1, -1, 0, 0, 1, 1, 1};
        for(int i = 0; i < booms.size(); i++){
            for (int j = 0 ; j < 8; j++){
                int xDanger = booms.get(i)[0] + xDangerRange[j];
                int yDanger = booms.get(i)[1] + yDangerRange[j];
                if (xDanger>=0 && xDanger < n && yDanger >=0 && yDanger <n ){
                    board[xDanger][yDanger] = 1;
                }
            }
        }
        // 지뢰 없는 곳만 세기
        int answer = 0;
        for (int i =0; i<n; i++){
            for(int j = 0; j < n ; j++){
                if(board[i][j]==0){
                    answer += 1;
                }
            }
        }


        return answer;
    }
}