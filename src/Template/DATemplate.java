package Template;

public abstract class DATemplate {
	protected Article article;

	public DATemplate(Article article) {
		this.article = article;
	}
	
	public final void display() {
		tit();
		con();
		foot();
	}

	protected abstract void tit();
	protected abstract void con();
	protected abstract void foot();
	
}
