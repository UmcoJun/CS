package Template;

import java.util.ArrayList;

public class Article {
	private String tit;
	private ArrayList<String> con;
	private String foot;
	
	public Article(String tit, ArrayList<String> con, String foot) {
		this.tit = tit;
		this.con = con;
		this.foot = foot;
	}

	public String getTit() {
		return tit;
	}

	public ArrayList<String> getCon() {
		return con;
	}

	public String getFoot() {
		return foot;
	}

}

