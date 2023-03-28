import java.util.Scanner;

public class Main {
	//0. 과목수 N 받기
	//1. 두번째 받은 점수들을 배열에 저장
	//2. 최고점 M과 총합sum을 구하기
	//3. 평균점수 계산결과 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] scores = new int[N];
		for (int i = 0; i < N; i++){
			scores[i] = sc.nextInt();
		}
		long M = 0;
		long sum = 0;
		for (int i = 0; i < N; i++){
			sum = sum + scores[i];
			if(M < scores[i]) M = scores[i];
		}
		System.out.println(sum * 100.0 / M / N ); // 부동소수점 문제 주의
	}
}
