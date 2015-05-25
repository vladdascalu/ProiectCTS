package eu.cts.testproiect;

import static org.junit.Assert.*;

import java.util.Date;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.cts.proiect.Meeting;

public class TestMeeting {

	Meeting meetingMock;
	
	Meeting meeting = new Meeting();

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
		meetingMock = mock(Meeting.class);
		when(meetingMock.getComment()).thenReturn("Fara comentarii");
		when(meetingMock.getdateAndTime()).thenReturn(
				new Date(2015, 5, 4, 15, 55));
		when(meetingMock.getDurationMillis()).thenReturn(600000L);
		when(meetingMock.getPriority()).thenReturn(2);
		when(meetingMock.getParticipants()).thenReturn("lista de participanti");
	}

	@After
	public void tearDown() throws Exception {
		meetingMock = null;
	}

	// functia 3 - getteri din Meeting
	@Test //test 8
	public void testGetComment() {
		assertEquals("Comentariul nu coincide", "Fara comentarii",
				meetingMock.getComment());
	}

	@SuppressWarnings("deprecation")
	@Test //test 9
	public void testGetDateAndTime() {
		assertEquals(new Date(2015, 5, 4, 15, 55), meetingMock.getdateAndTime());
	}
	
	@Test //test 10
	public void testGetDurationMillis() {
		assertEquals(600000L, meetingMock.getDurationMillis());
	}
	
	@Test //test 11
	public void testGetPriority(){
		assertEquals(2, meetingMock.getPriority());
	}
	
	@Test //test 12
	public void testGetParticipants() {
		assertEquals("lista de participanti", meetingMock.getParticipants());
	}
	
	//functia 4 - 
	@Test //test 13
	public void testSetParticipantsNormalValues() {
		meeting.setParticipants("participant1, participant2");
		assertEquals("participant1, participant2", meeting.getParticipants());
	}
	
	@Test //test 14
	public void testSetParticipantsHugeValues() {
		String parts = "participant1 " +"participant2 "+"participant3 "+"participant4 "+"participant5 "+"participant6 "+"participant7 "+"participant8 "+
						"participant9 "+"participant10 "+"participant11 "+"participant12 "+"participant13 "+"participant14 "+"participant15 "+"participant16 "+
						"participant17 "+"participant18 "+"participant19 "+"participant20 "+"participant21 "+"participant22 "+"participant23 "+"participant24 "+
						"participant25 "+"participant26 "+"participant27 "+"participant28 "+"participant29 "+"participant30 "+"participant31 "+"participant32 "+
						"participant33 "+"participant34 "+"participant35 "+"participant36 "+"participant37 "+"participant38 "+"participant39 "+"participant40 "+
						"participant41 "+"participant42 "+"participant43 "+"participant44 "+"participant45 "+"participant46 "+"participant47 "+"participant48 "+
						"participant49 "+"participant50 "+"participant51 "+"participant52 "+"participant53 "+"participant54 "+"participant55 "+"participant56 "+
						"participant57 "+"participant58 "+"participant59 "+"participant60 "+"participant61 "+"participant62 "+"participant63 "+"participant64 "+
						"participant65 "+"participant66 "+"participant67 "+"participant68 "+"participant69 "+"participant70 "+"participant71 "+"participant72 "+
						"participant73 "+"participant74 "+"participant75 "+"participant76 "+"participant77 "+"participant78 "+"participant79 "+"participant80 "+
						"participant81 "+"participant82 "+"participant83 ";
		meeting.setParticipants(parts);
		
		assertEquals(parts, meeting.getParticipants());
	}
	
	@Test //test 15
	public void testSetParticipantsNoValue() {
		meeting.setParticipants("");
		assertEquals("", meeting.getParticipants());
	}
	
	@Test //test 16
	public void testSetParticipantsOnlyNumbers() {
		meeting.setParticipants("123321123321");
		assertEquals("123321123321", meeting.getParticipants());
	}
	
	

}
