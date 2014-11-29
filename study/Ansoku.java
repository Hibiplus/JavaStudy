package study;
import java.util.Scanner;

public class Ansoku {
	/*
	 * input a b R #工事現場のx座標,工事現場のy座標,工事現場の騒音の大きさ N　　　　　 #木陰の数 x_1 y_1
	 * #木陰1のx座標,木陰1のy座標 x_2 y_2　　#木陰2のx座標,木陰2のy座標 ... x_N y_N #木陰Nのx座標,木陰Nのy座標
	 *
	 * (x-a)^2+(y-b)^2 >= R^2
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int [n];

		for(int i = 0;i < n ; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			if( ( (x[i] - a) * (x[i] - a) + (y[i] - b) * (y[i] - b) ) >= r*r ){
				System.out.println("silent");
			}else{
				System.out.println("noisy");
			}

		}
	}
}
