package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		
		CompactDisc cd = new CompactDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		Book book = new Book();
		
		mediae.add(cd);
		mediae.add(book);
		mediae.add(dvd);
		
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
		
		Collections.sort(mediae,Media.COMPARE_BY_COST_TITLE);
	}
	
	
	
	
}
