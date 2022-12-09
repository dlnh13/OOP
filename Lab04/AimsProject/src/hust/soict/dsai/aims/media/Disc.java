package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title); 
		this.setCategory(category);
		this.setCost(cost);
		this.director = director;
		this.length = length;
	}
	public Disc() {
		super();
	}
	
}
