package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media() {
		super();
	}

	public Media(int id ,String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = id;
	}

	public Media(String title) {
		super();
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Media) {
			Media oMedia = (Media) o;
			if (this.getTitle().equals(oMedia.getTitle())) {
				result = true;
			}
		}

		return result;
	}
	
	public static final Comparator<Media>COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media>COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}

}
