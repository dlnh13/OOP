package hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media m) {
		for (Media media : itemsOrdered) {
			if (media.equals(m)) {
				System.out.println("Item exited");
				return;
			}
		}
		itemsOrdered.add(m);
		System.out.println("Added");
	}
	
	public Store() {
		super();
	}
	
	public void removeMedia(Media m) {
		for (Media media : itemsOrdered) {
			if (media.equals(m)) {
				itemsOrdered.remove(m);
				System.out.println("Removed");
				return;
			}
		}

		System.out.println("Item not exit");
		
	}
	
	public int currentId() {
		return this.itemsOrdered.size();
	}
	
	public Media findById(int id) {
		for (Media media : itemsOrdered) {
			if (media.getId()==id) {
				return media;
			}
		}
		System.out.println("Not found");
		return null;
		
	}
	
	public Media findByTitle(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		System.out.println("Not found");
		return null;
		
	}
	
	public void displayStore() {
		if(itemsOrdered.size()>0)
		for (Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
		else System.out.println("Store is empty");
	}
	
}
