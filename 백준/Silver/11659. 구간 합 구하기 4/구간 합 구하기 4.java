import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in)); // 읽어야하는 수가 많을땐 Scanner보다 BufferedReader 사용
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 예제의 첫번째 줄을 읽음
		int N = Integer.parseInt(stringTokenizer.nextToken()); // 주어진 숫자의 개수 N
		int M = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야 하는 횟수 M

		long[] S = new long[N + 1]; // 합배열 선언 (사람은 1번째부터세지만, 컴퓨터는 0번째부터 세므로 이 차이를 없애기 위한 N+1)

		stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 예제의 두번째 줄을 읽음
		for (int i = 1; i <= N; i++) { // 0번째 인덱스는 비워놓고 계산(편의성)
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // 합배열의 값 계산
		}
		for (int k = 0; k < M; k++) { // 문제의 개수만큼 값 계산
			stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 예제의 세번째 줄 이후를 읽음
			int i = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야하는 시작점 i
			int j = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야하는 끝점 j
			System.out.println(S[j] - S[i - 1]);
		}
	}

}
