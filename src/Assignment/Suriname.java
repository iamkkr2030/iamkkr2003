package Assignment;

public class Suriname extends Drama implements Netflix{
	String title;
	
	Suriname(){}
	
	public void dTitle() {
		System.out.println("수리남\n");
	}
	
	void award() {
		System.out.println("드라마의 수상 기록");
		System.out.println("1.2022년 코리아 드라마 어워즈 대상:하정우");
	}
	void performance() {
		System.out.println("드라마 흥행 성적");
		System.out.println("1.넷플릭스 최고 순위:1위\n");
		
	}
	void revenue(int sales_cost,int prod_cost) {
		System.out.println("제작비:약 "+prod_cost+"억 이상");
		System.out.println("예상 수익:자세한 수익은 나오지 않았지만 제작비의 몇 배나 되는 수익을 벌었을 것으로 추산");
	}
}
