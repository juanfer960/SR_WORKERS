package component;

public class Item {
	
	public int score;
	public String artistName;

	public Item(int parseInt, String artisId) {
		score = parseInt;
		artistName = artisId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
