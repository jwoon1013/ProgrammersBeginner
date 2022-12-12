class Solution {
    public String[] solution(String[] quiz) {
        
        
String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++){
            String[] oneQuiz = quiz[i].split(" ");
            int oneQuizCacul = 0;
            if(oneQuiz[1].equals("+")){
                oneQuizCacul = Integer.parseInt(oneQuiz[0])+Integer.parseInt(oneQuiz[2]);
            }
            if(oneQuiz[1].equals("-")){
                oneQuizCacul = Integer.parseInt(oneQuiz[0])-Integer.parseInt(oneQuiz[2]);
            }
            if (oneQuizCacul == Integer.parseInt(oneQuiz[4])){
                answer[i] = "O";
            }
            if (oneQuizCacul != Integer.parseInt(oneQuiz[4])){
                answer[i] = "X";
            }
        }


        return answer;
    }
}