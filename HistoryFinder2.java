


public class HistoryFinder2 {
public static void main(String args[]){
	
	if(args.length != 2 ){
		System.out.println("引数は3つ指定してください");
		return;
	}
	
	//戦国時代の歴史(年号のみ)
		int[] years = {
				1553,
				1560,
				1575,
				1582,
				1600,
				1614,
				1615
		};
		
		//戦国時代の歴史(歴史名)
		String[] histories = {
			"川中島の戦い",
			"桶狭間の戦い",
			"長篠の戦い",
			"本能寺の変",
			"関が原の戦い",
			"大阪冬の陣",
			"大阪夏の陣"
		};

		int startYear = Integer.parseInt(args[0]);
		int EndYear = Integer.parseInt(args[1]);
		
		for(int i =0;i < years.length;i++){
			if(years[i] >= startYear && years[i] <= EndYear){
				System.out.println(years[i]+"年："+histories[i]);
			}
		}
}
}
