package songplayer;

import java.util.ArrayList;

import model.JukeBox;
import model.PlayList;
import model.Song;
import model.Student;



public class QueueAndPlay3SongsInOrder {
	public static PlayList pl;
	public static String baseDir = System.getProperty("user.dir") + System.getProperty("file.separator") + "songfiles"
		      + System.getProperty("file.separator");
	public static void main(String[] args){
		JukeBox jb = new JukeBox();
		//pl = jb.playList;
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Song s1 = new Song("flute.aif", 5, "a",baseDir+"flute.aif");
		Song s2 = new Song("spacemusic.au", 6, "microsoft", baseDir+"spacemusic.au");
		Song s3 = new Song("tada.wav", 2, "microsoft",baseDir+"tada.wav");
		// add songs
		try{
			jb.addSong("Devon", 22, s1);
		} catch (Exception e) {
			System.out.print("song cannot be played");
		}
		
		try{
			jb.addSong("Devon", 22, s2);
		} catch (Exception e) {
			System.out.print("song cannot be played");
		}
		
		try{
			jb.addSong("Devon", 22, s3);
		} catch (Exception e) {
			System.out.print("song cannot be played");
		}
//		try{
//			jb.addSong("Devon",22,new Song("spacemusic.au", 6, "microsoft", baseDir+"spacemusic.au"));
//		}catch (Exception  e){
//			System.out.print("student cant play song");
//		}
//		
//		try{
//			jb.addSong("Devon",22,new Song("BlueRidgeMountainMist", 38, "a", baseDir+"BlueRidgeMountainMist.mp3"));
//		}catch (Exception  e){
//			System.out.print("student cant play song");
//		}
//		
//		try{
//			jb.addSong("Devon",22,new Song("DeterminedTumbao", 38, "b", baseDir+"DeterminedTumbao.mp3"));
//		}catch (Exception  e){
//			System.out.print("student cant play song");
//		}
//		
//		try{
//			jb.addSong("Devon",22,new Song("DeterminedTumbao", 38, "b", baseDir+"DeterminedTumbao.mp3"));
//		}catch (Exception  e){
//			System.out.print("student cant play song");
//		}
		
//			pl.addSong(new Song("flute.aif", 5, "flute.aif", baseDir+"flute.aif"));
//		
//		pl.addSong(new Song("tada.wav",5, "tada.wav", baseDir+"tada.wav"));
		jb.playList.playNextSong();

	}
	
			
}

