package Assignment;

public class Drama implements Netflix {
	String title;
	int make_cost=0;
	int sales_cos=0;
	
	public void dTitle(Netflix netflix){
		netflix.dTitle();
	}
	void award() {
		System.out.println("드라마의 수상 기록");
	}
	void performance() {
		System.out.println("드라마 흥행 성적");
	}
	void revenue(int sales_cost,int prod_cost) {
		System.out.println("제작비:약 "+prod_cost+"억 이상");
		System.out.println("예상 수익:약 "+prod_cost+"억 이상");
	}
}