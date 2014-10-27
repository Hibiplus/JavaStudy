
public class IfSample {
public static void main(String[] args){
	
	//コマンドライン変数を数値に変換
	int point = Integer.parseInt(args[0]);
	
	System.out.println("結果は以下のとおりです");
	
	/*コマンドライン変数の値が80以上の場合 
	 「合格！」と表示*/
	if(point >= 80){
		System.out.println("合格！");
	}

}
}
