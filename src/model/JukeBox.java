package model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {

	ArrayList<Student> students;
	ArrayList<Song> songs;
	public PlayList playList;
	static LocalDate lastPlay;
	
	public JukeBox() {
		songs = new ArrayList<Song>(); //all of the possible songs
		playList = new PlayList();
		lastPlay = LocalDate.now();
		students = new ArrayList<Student>();
		students.add(new Student("Chris",1));
		students.add(new Student("Devon",22));
		students.add(new Student("River",333));
		students.add(new Student("Ryan",4444));
	}
	
	//sets all songs to zero times played by the Jukebox
	public void reset() {
		for (int i = 0; i<songs.size();i++){
			songs.get(i).reset();
		}
		for (int i = 0;i < students.size();i++){
			students.get(i).reset();
		}
	}
	
	public void addSong(String refId, int refPassword, Song refSong) throws Exception {
		
		// check midnight
		if (isMidnight()) {
			reset();
		}
		Student refStudent=null;
		for (int i = 0; i < students.size(); i++) {
			if (refId.equals(students.get(i).getId()) && refPassword == students.get(i).getPassword()) {
				refStudent = students.get(i);
			}
		}
		if (refStudent !=null){
				if ( refStudent.canPlay(refSong) && refSong.canBePlayed()) {
					playList.addSong(refSong);  //add song
					refStudent.playASong(refSong); // student counter++
					refSong.play(); // song counter++
					lastPlay.now(); // record time of last play to check reset
				}
			}
	}

	private boolean isMidnight() {
		LocalDate time = LocalDate.now();
		if (time.isAfter(lastPlay)) {
			return true;
		}
		else {
			return false;
		}
	}
}
