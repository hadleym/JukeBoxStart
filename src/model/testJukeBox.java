package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class testJukeBox {

	@Test
	public void testStudent(){
		Song s1 = new Song("spacemusic.au", 6, "microsoft", "spacemusic.au");
		Song s2 = new Song("BlueRidgeMountainMist", 38, "a","BlueRidgeMountainMist.mp3");
		Song s3 = new Song("DeterminedTumbao", 1500*60-5, "b", "DeterminedTumbao.mp3");
		Student s = new Student("Chris", 1);
		assertEquals(0,s.getNumOfPlay());
		assertEquals(0,s.getSeconds());
		s.playASong(s1);
		assertEquals(1,s.getNumOfPlay());
		assertEquals(6,s.getSeconds());
		s.playASong(s1);
		assertEquals(2,s.getNumOfPlay());
		assertEquals(12,s.getSeconds());
		s.playASong(s2);
		assertTrue(!s.canPlay(s3));
		assertEquals(3,s.getNumOfPlay());
		s.playASong(s2);
		assertTrue(!s.canPlay(s2));
		assertEquals("Chris",s.getId());
		s.reset();
		assertTrue(s.canPlay(s2));
		assertEquals(0,s.getNumOfPlay());
		assertEquals(88,s.getSeconds());
		assertEquals(1,s.getPassword());
	}
	
	
}
