import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {

	ArrayList<Student> students;
	ArrayList<Song> songs;
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Chris",1));
		students.add(new Student("Devon",22));
		students.add(new Student("River",333));
		students.add(new Student("Ryan",4444));
		
		ArrayList<Song> songs = new ArrayList<Song>();
		//all of the possible songs
		Queue<Song> playList = new LinkedList<Song>();
		
		
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
}
