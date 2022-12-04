package Assignment;

public class Woo extends Drama implements Netflix{
	String title;
	
	Woo(){}
	
	public void dTitle() {
		System.out.println("이상한 변호사 우영우\n");
	}
	
	void award() {
		System.out.println("드라마의 수상 기록");
		System.out.println("1.아시아 컨텐츠 어워즈 베스트 컨텐츠 상 수상");
		System.out.println("2.아시아 컨텐츠 어워즈 여자배우상 수상:박은빈");
		System.out.println("3.코리아 드라마 어워즈 작품상 수상");
	}
	void performance() {
		System.out.println("흥행 성적");
		System.out.println("1.넷플릭스 비영어권 7주 연속 1위");
		System.out.println("2.TV 최고 시청률 17%, 순간 최고 시청률 19% 달성\n");
		
	}
	void revenue(int sales_cost,int prod_cost) {
		System.out.println("제작비:약 "+prod_cost+"억 이상");
		System.out.println("예상 수익:우영우로 인한 경제효과 1조로 예상");
	}
}
