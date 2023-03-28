import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nums = sc.next();
		char[] chars = nums.toCharArray();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + Integer.parseInt(String.valueOf(chars[i]));
		}
		System.out.println(sum);
	}
}
