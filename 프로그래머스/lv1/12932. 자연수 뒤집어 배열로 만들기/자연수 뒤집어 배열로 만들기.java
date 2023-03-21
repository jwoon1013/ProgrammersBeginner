import java.util.Arrays;

class Solution {
	public static int[] solution(long n) {
		StringBuilder stringBuilder = new StringBuilder();
		String[] stringArr = stringBuilder.append(n).reverse().toString().split("");
		
		int[] answer = new int[stringArr.length];
		for (int i = 0; i < stringArr.length; i++){
			answer[i] = Integer.parseInt(stringArr[i]);
		}
		return answer;
	}
}
