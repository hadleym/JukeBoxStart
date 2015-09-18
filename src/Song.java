
public class Song {
	private String name;
	private int seconds;
	private String artist;
	private int timesPlayed;
	
	public Song (String iniName, int iniSeconds, String iniArtist) {
		name = iniName;
		seconds = iniSeconds;
		artist = iniArtist;
		timesPlayed = 0;
	}
	
	public boolean canBePlayed() {
		if (timesPlayed < 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void play() {
		// under construction
		timesPlayed++;
	}
	
	// reset play times at midnight, called by JukeBox or PlayList
	public void reset() {
		timesPlayed=0;
	}

	public int getLength() {
		return seconds;
	}
}
