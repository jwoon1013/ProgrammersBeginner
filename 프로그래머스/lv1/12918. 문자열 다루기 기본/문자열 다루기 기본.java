class Solution {
    public boolean solution(String s) {
        // 1. 길이가 4 혹은 6인가? > true / false
        boolean lengthCheck = s.length() == 4 || s.length() == 6;

        // 2. 숫자로만 되있나? > true / false
        boolean onlyNumbers;
        onlyNumbers = s.matches("^[0-9]*$");

        // 3. 1,2가 다 true인가? true 둘중 하나라도 false면 false
        boolean answer;
        if (lengthCheck && onlyNumbers) {
            answer = true;
        } else answer = false;

        return answer;
    
    }
}