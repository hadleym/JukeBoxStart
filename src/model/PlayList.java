package model;
import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import songplayer.EndOfSongEvent;
import songplayer.EndOfSongListener;
import songplayer.SongPlayer;

public class PlayList {
	private ArrayList<Song> songList = new ArrayList<Song>();
	public EndOfSongListener listener = new OurEndOfSongListener();
	private int index;
	public static String baseDir = System.getProperty("user.dir") + System.getProperty("file.separator") + "songfiles"
		      + System.getProperty("file.separator");
	public PlayList(){
		index = 0;
	
	}
	
	public void addSong(Song s){
		songList.add(s);
		
	}
	public void playNextSong() {
		if (index < songList.size()) {
			SongPlayer.playFile(listener, songList.get(index).getPath());
			index++;
		}
		
	}
	
	public void play(){
		this.playNextSong();
	}
	public void playSong(){
		//play a song if there are songs to play
	}
	private class OurEndOfSongListener implements EndOfSongListener{

		@Override
		public void songFinishedPlaying(EndOfSongEvent eventWithFileNameAndDateFinished) {
			playNextSong();
		}	
	}
	public int getSize() {
		return songList.size();
	}

	
}
