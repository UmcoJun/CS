package Template;

import java.util.ArrayList;

public class CDArticle extends DATemplate {

	public CDArticle(Article article) {
		super(article);
	}

	@Override
	protected void tit() {
		System.out.println("Title: " + article.getTit());
	}
	
	@Override
	protected void con() {
		System.out.println("Content:");
		
		ArrayList<String> con = article.getCon();
		int conLi = con.size();
		for(int i=0; i<conLi; i++) {
			System.out.println("   " + con.get(i));
		}
	}
	
	@Override
	protected void foot() {
		System.out.println("Footer: " + article.getFoot());
	}

}
