
public class Calc3 {
	public static void main(String args[]){
		
		//引数が3つじゃなかったら
		if(args.length != 3 ){
			System.out.println("引数は3つ指定してください");
			return;
		}
		int result = 0;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String operator = args[2];
		
		if(operator.equals("add")){
			result = num1 + num2;
		}else if(operator.equals("minus")){
			result = num1 -num2;
		}else if(operator.equals("multi")){
			result = num1 * num2;
		}else if(operator.equals("div")){
			result = num1 / num2;
		}else{
			System.out.println("足し算はadd\n引き算はminus\n掛け算はmulti\n割り算はdiv\nを指定してください");
			return;
		}
			System.out.println("計算結果は"+result);
	}
}
