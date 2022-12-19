class Solution {
    public String solution(String phone_number) {
        // 1. 전화번호 글자별로 분리한 String배열(numbers)
        String[] numbers = phone_number.split("");

        // 2. numbers에서 끝에서 5번째 숫자 인덱스 a ex) length 10이면 index 6 ( length-4)
        int a = numbers.length - 4;

        // 3. numbers에서 index 0부터 index a 까지를 *로 변경
        for ( int i = 0 ; i < a ; i ++){
            numbers[i] = "*";
        }

        // 4. answer = numbers 를 String 으로 변경
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numbers.length; i++){
            answer.append(numbers[i]);
        }
        

        return answer.toString();
    }
}