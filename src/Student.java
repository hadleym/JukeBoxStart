
public class Student {
	private String id;
	private int password;
	private int minutes;
	private int songsPlayed;
	
	public Student(String iniId, int iniPassword) {
		id = iniId;
		password = iniPassword;
		minutes = 0;
		songsPlayed = 0;
	}
	
	public boolean auth(String refId, int refPassword) {
		if (refId == id && refPassword == password) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean canPlay() {
		if (songsPlayed < 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
