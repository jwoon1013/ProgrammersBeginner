class Solution {
    public String solution(int num) {
        String answer = (num == 0 || num % 2 == 0) ? "Even" : "Odd";
        return answer;           
    }
}