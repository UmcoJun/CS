package Template;

import java.util.ArrayList;

public class SDArticle extends DATemplate{

	public SDArticle(Article article) {
		super(article);
	}
	
	@Override
	protected void tit() {
		System.out.println(article.getTit());
	}
	
	@Override
	protected void con() {
		ArrayList<String> con = article.getCon();
		int conLi = con.size();
		for(int i=0; i<conLi; i++) {
			System.out.println(con.get(i));
		}
	}

	@Override
	protected void foot() {
		System.out.println(article.getFoot());
	}
	
}
