package Template;

import java.util.ArrayList;

public class MainEntry {

	public static void main(String[] args) {
		String tit = "템플릿";
		
		ArrayList<String> con = new ArrayList<String>();
		con.add("클래스간의 효율적이고 최적화된 관계");
		con.add("어떻게 사용하는지 이해하라");
		con.add("까먹으면 이 자료를 다시 찾아보아라");
		
		String foot = "기본기를 튼튼하게 완벽하게 하자";
		
		Article article = new Article(tit, con, foot);
		
		System.out.println("[case-1]");
		DATemplate s1 = new SDArticle(article);
		s1.display();
		
		System.out.println();
		
		System.out.println("[case-2]");
		DATemplate s2 = new CDArticle(article);
		s2.display();
	}
	
	
}
