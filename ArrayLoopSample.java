
public class ArrayLoopSample {
public static void main(String[] args){
	String[] names = {"山田","田中","鈴木"};
	for(int i = 0;i < 3;i++){
		System.out.println(i+"回目");
		System.out.println("こんにちは"+names[i]+"さん");
	}
}
}
