	import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stringer {
	    public static void main(String[] args) throws Exception {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String readLine = br.readLine();
	        readLine = readLine.trim();
	        String[] readLineArray = readLine.split("[\\s]+");
	        if(readLineArray[0].equals(readLineArray[1])){
	            System.out.println("True");
	        }
	        else{
	            System.out.println("False");
	        }
	        System.out.println(readLineArray[0]);
	        System.out.println(readLineArray[1]);
	    }
	}

