package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Student;
import model.StudentManager;

public class TestIteration2 {
	private static final int MAX_PLAY_TIME = 90000;
	@Test
	public void TestStudentManager(){
		StudentManager sm = new StudentManager();
		assertTrue(sm.add("Mark", "12"));
		assertEquals(1, sm.getSize());
		assertTrue(sm.add("Mingchen", "777"));
		assertEquals(2, sm.getSize());
		assertEquals(null, sm.getCurrent());
		assertTrue(sm.login("Mark", "12"));
		assertEquals("Mark", sm.getCurrent());
		assertTrue(sm.currentStudentHasEnoughTime(90000));
		assertEquals(90000, sm.currentStudentRemainingTime());
		assertTrue(sm.currentStudentHasAPlay());
		assertEquals(3, sm.currentStudentRemainingPlays());
		sm.playedSong(100);
		assertTrue(sm.currentStudentHasEnoughTime(89900));
		assertEquals(89900, sm.currentStudentRemainingTime());
		assertTrue(sm.currentStudentHasAPlay());
		assertEquals(2, sm.currentStudentRemainingPlays());
		sm.playedSong(89899);
		assertEquals(1, sm.currentStudentRemainingTime());
		assertTrue(sm.currentStudentHasEnoughTime(1));
		assertTrue(sm.currentStudentHasAPlay());
		sm.playedSong(1);
		assertTrue(sm.currentStudentHasEnoughTime(0));
		assertTrue(!sm.currentStudentHasAPlay());
		sm.reset();
		assertTrue(sm.currentStudentHasAPlay());
		assertTrue(sm.currentStudentHasEnoughTime(0));
		sm.login("Mingchen", "777");
		assertTrue(sm.currentStudentHasEnoughTime(MAX_PLAY_TIME));
		assertTrue(sm.currentStudentHasAPlay());
		assertTrue(!sm.login("Mark","888"));
		assertEquals("No User Logged In",sm.getCurrentStudentId());
		assertTrue(!sm.currentStudentHasEnoughTime(-1));
		assertTrue(sm.login("Mingchen", "777"));
		assertEquals("Mingchen",sm.getCurrentStudentId());
		
		
		
	}
}
