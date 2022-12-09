package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}

	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public CompactDisc() {
		super();
	}

	public void addTrack(Track newTrack) {
		boolean check = false;
		for (Track track : tracks) {
			if (track.equals(newTrack)) {
				System.out.println("already existed");
				check = true;
			}
		}

		if (check == false)
			tracks.add(newTrack);
	}

	public void removeTrack(Track newTrack) {
		for (int i = 0; i < tracks.size(); i++) {
			if (tracks.get(i).equals(newTrack))
				tracks.remove(i);
		}
	}

	public int getLength() {
		return this.tracks.size();
	}

	public void play() {
		for (Track track : tracks) {
			track.play();
		}
	}
}
