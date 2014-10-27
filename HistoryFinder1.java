
public class HistoryFinder1 {
public static void main(String args[]){
	
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
	for(int i = 0;i<years.length;i++){
			System.out.println(years[i]+"年："+histories[i]);
	}
}
}
