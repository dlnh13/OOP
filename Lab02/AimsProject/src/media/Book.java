package media;

import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id ;
    private String title;
	private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();
	public Book() {
		
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		int check = 1;
		for (int i = 0; i< authors.size(); i++) {
			if (authors.get(i).equalsIgnoreCase(authorName)) {
				System.out.println("Error: Đã tồn tại tên tác giả "+ authorName+ " trong danh sách!!!");
				check = 0;
			}
			if(check == 1 ){
		        authors.add(authorName);
		        System.out.println("Thông báo: Đã add tác giả "+authorName+" vào danh sách tác giả!");
		    }
		}
	}

public void removeAuthor(String authorName) {
	int check = 1;
	for (int i = 0; i< authors.size(); i++) {
		if (authors.get(i).equalsIgnoreCase(authorName)) {
		    authors.remove(authorName);
		    check = 0;
		}
		if(check == 1 ){
	        System.out.println("Thông báo: Không tồn  tác giả "+authorName+"  danh sách tác giả!");
	    }
	}
}
}
