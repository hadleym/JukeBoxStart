package model;

public class Song {
	private String name;
	private int seconds;
	private String artist;
	private int timesPlayed;
	private String path;
	
	public Song (String iniName, int iniSeconds, String iniArtist, String inipath) {
		name = iniName;
		seconds = iniSeconds;
		artist = iniArtist;
		timesPlayed = 0;
		path = inipath;
	}
	
	public boolean canBePlayed() {
		return timesPlayed<3;
	}
	
	public void play() {
		// under construction
		timesPlayed++;
	}
	
	// reset play times at midnight, called by JukeBox or PlayList
	public void reset() {
		timesPlayed=0;
	}
	
	public String getPath(){
		return path;
	}

	public int getLength() {
		return seconds;
	}
	
	public String getName(){
		return name;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public int getLengthInSeconds(){
		return seconds;
	}
	
	public int getTimesPlayed(){
		return timesPlayed;
	}
}
