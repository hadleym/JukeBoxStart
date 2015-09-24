package view;
import java.awt.event.MouseAdapter;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sun.glass.events.MouseEvent;

import model.PlayList;
import model.Song;

public class JukeboxGUI extends JFrame{
	
	public static void main(String[] args) {
	    new JukeboxGUI().setVisible(true);
	  }
	
	private songList songs;
	private PlayList playList;
	
	public JukeboxGUI() {
	    setSize(500, 350);
	    setLocation(300, 80);
	    this.setTitle("JukeBox");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    songs = new songList();
	    JTable view = new JTable(songs);
	    view.setModel(songs);
	    

	    // Can use a layout strategy or null.  If null, every component must have it's
	    // location and size set. Also, to see column headers, you must decorate the
	    // JTable with a JScollPane. New stuff, but taught in the most efficient manner.
	    setLayout(null);
	    JScrollPane scrollPane = new JScrollPane(view); // Put a scrollpane around table 
	    scrollPane.setLocation(50, 50);
	    scrollPane.setSize(400, 200);
	    this.add(scrollPane); // The scrollpane holds the JTable inside as an instance var
	  }

}

class songList implements TableModel {
	  private ArrayList<Song> data = new ArrayList<Song>();
	  private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	  public static String baseDir = System.getProperty("user.dir") + System.getProperty("file.separator") + "songfiles"
			      + System.getProperty("file.separator");
	  
	  public songList() {  
	    data.add(new Song("BlueRidgeMountainMist", 38, "a", baseDir+"BlueRidgeMountainMist.mp3"));
	    data.add(new Song("DeterminedTumbao", 38, "b", baseDir+"DeterminedTumbao.mp3"));
	    data.add(new Song("flute", 5, "flute", baseDir+"flute.aif"));
	    data.add(new Song("spacemusic", 6, "microsoft", baseDir+"spacemusic.au"));
	    data.add(new Song("SwingCheese", 38, "c", baseDir+"SwingCheese.mp3"));
	    data.add(new Song("tada",5, "tada", baseDir+"tada.wav"));
	    data.add(new Song("UntameableFire", 38, "d", baseDir+"UntameableFire.mp3"));
	  }

	public Song getSong(String name) {
		for (int i = 0; i <= data.size(); i++) {
			if (data.get(i).getName().equals(name))
				return data.get(i);
		}
		return null;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0)
	    	 return "Artist";
	     if (columnIndex == 1)
	    	 return "Title";
	     return "Seconds";
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		if (columnIndex == 2)
	    	 return int.class;
	   return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Song currentSong = data.get(rowIndex);
		if (columnIndex == 0)
			return currentSong.getArtist();
		if (columnIndex == 1)
			return currentSong.getName();
		return currentSong.getLength();
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}
}
