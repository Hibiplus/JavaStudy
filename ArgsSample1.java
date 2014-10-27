
import java.io.StringReader;
import java.util.Scanner;
public class ArgsSample1 {
public static void main(String[] args){
	System.out.println("名前を入力してください");
	//Scannerメソッドを使用
	Scanner scan = new Scanner(System.in);
	//一度１ラインスキャンして、その内容をもう一度スキャン
	scan.useDelimiter("[\r\n]+");
    scan = new Scanner(new StringReader(scan.next()));
    
		while(scan.hasNext()){
			String str = scan.next();
			System.out.println("こんにちは！"+str+"さん");
		}
	System.out.println("終了");
}
}

