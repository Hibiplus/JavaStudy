package study;

import java.util.Scanner;

public class BallInBox {

	/*
	 * 半径r のお気に入りのボールを手に入れたあなたは、それを収納することができる箱を探しています。
	 * 
	 * 今、n 個の箱があり、i (1 ≦ i ≦ n) 番目の箱は高さh_i、幅w_i、奥行きd_i
	 * です。各箱においてボールの直径が、箱の高さ、幅、奥行きの3つの長さのうち最も短いもの以下であれば、無事にボールを収納することができます。
	 */

	/*
	 * n r　　　#箱の数n, ボールの半径r 表す整数 h_1 w_1 d_1　　　#1個目の箱の高さ、幅、奥行きを表す整数 h_2 w_2
	 * d_2　　　#2個目の箱の高さ、幅、奥行きを表す整数 ... h_n w_n d_n　　　#n個目の箱の高さ、幅、奥行きを表す整数
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] h = new int[n];
		int[] w = new int[n];
		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			w[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}

		sc.close();
		for (int i = 0; i < n; i++) {
			if (h[i] <= w[i] && h[i] <= d[i]) {
				if (r * 2 <= h[i]) {
					System.out.println(i + 1);
				}
			} else if (w[i] <= d[i] && w[i] <= h[i]) {
				if (r * 2 <= w[i]) {
					System.out.println(i + 1);
				}
			} else if (d[i] <= h[i] && d[i] <= w[i]) {
				if (r * 2 <= d[i]) {
					System.out.println(i + 1);
				}
			}
		}

	}
}
