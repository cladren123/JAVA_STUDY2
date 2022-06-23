package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3xN ũ���� ���� 2x1, 1x2�� ä��� ����� ���� ���ϴ� ����
 * @author Rave
 *
 */
public class Main {

	/**
	 * �� Ǯ����� 4��, 6�� .. ¥�� ������� ����� ��츦 ����� �����ϴ°� �߰� ���ؼ� Ʋ��
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 2; i <= n; i += 2) {
			dp[i] += dp[i - 2] * 3;
			for (int j = 4; j <= i; j += 2)
				dp[i] += dp[i - j] * 2;
		}
		System.out.println(dp[n]);
	}
}