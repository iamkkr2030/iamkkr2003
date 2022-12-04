package Assignment;

public class SquidGame extends Drama implements Netflix{
	String title;
	
	SquidGame(){}
	
	public void dTitle() {
		System.out.println("오징어 게임\n");
	}
	
	void award() {
		System.out.println("드라마의 수상 기록");
		System.out.println("1.백상예술대상 TV부문 대상");
		System.out.println("2.새틀라이트상 TV 드라마 시리즈 작품상");
		System.out.println("3.골든글러브 남우주연상:이정재");
		System.out.println("4.프라임타임 에미상 남우주연상:이정재");
		System.out.println("5.미국 배우 조합상 여자연기상:정호연");
		System.out.println("이 외에도 많다.");
	}
	void performance() {
		System.out.println("넷플릭스 흥행 성적");
		System.out.println("1.넷플릭스가 정식 서비스 중인 모든 국가에서 최초로 1위 달성");
		System.out.println("2.비영어권 국가 10주 연속 1위\n");
		
	}
	void revenue(int sales_cost,int prod_cost) {
		System.out.println("제작비:약 "+prod_cost+"억 이상");
		System.out.println("예상 수익:약 "+prod_cost+"억 이상");
	}
}
