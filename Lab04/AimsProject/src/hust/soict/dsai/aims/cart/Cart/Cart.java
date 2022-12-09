package hust.soict.dsai.aims.cart.Cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	
	public void addMedia(Media m) {
		for (Media media : itemsOrdered) {
			if (media.equals(m)) {
				System.out.println("Item exited");
				return;
			}
		}
		itemsOrdered.add(m);
		System.out.println("Number of DVDs in the current cart: " + itemsOrdered.size());
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
		return itemsOrdered.size();
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			total = (float) total + this.itemsOrdered.get(i).getCost();
		}
		return total;
	}

	public void displayCart() {
		if(itemsOrdered.size()>0)
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.get(i).toString());
		}
		else System.out.println("Cart is empty");
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.print(i+1 +".");
			System.out.println(itemsOrdered.get(i).toString());
		}	
		System.out.println("***************************************************");
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
}
