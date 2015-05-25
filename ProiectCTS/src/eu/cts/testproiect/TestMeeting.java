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
	
	//functia 6
	@Test //test 19
	public void testSetPriority0(){
		meeting.setPriority(0);
		assertEquals(0, meeting.getPriority());
	}
	
	@Test //test 20
	public void testSetPriority1(){
		meeting.setPriority(1);
		assertEquals(1, meeting.getPriority());
	}
	
	@Test //test 21
	public void testSetPriority2(){
		meeting.setPriority(2);
		assertEquals(2, meeting.getPriority());
	}
	
	@Test //test 22
	public void testSetPriority3(){
		meeting.setPriority(3);
		assertEquals(3, meeting.getPriority());
	}
	
	@Test //test 23
	public void testSetPriority4(){
		meeting.setPriority(4);
		assertEquals(4, meeting.getPriority());
	}
	
	//functia 7
	@Test //test 24
	public void testSetDurationMillisNormalValues() {
		meeting.setDurationMillis(1000000L);
		assertEquals(1000000L, meeting.getDurationMillis());
	}
	
	@Test //test 25
	public void testSetDurationMillisZeroValue() {
		meeting.setDurationMillis(0);
		assertEquals(0, meeting.getDurationMillis());
	}
	
	//functia 8
	@Test //test 26
	public void testSetCommentNormalValues() {
		meeting.setComment("un comentariu normal.");
		assertEquals("un comentariu normal.", meeting.getComment());
	}
	
	@Test //test 27
	public void testSetCommentNumericValues() {
		meeting.setComment("12345678987654321");
		assertEquals("12345678987654321", meeting.getComment());
	}
	
	@Test //test 28
	public void testSetCommentNoString() {
		meeting.setComment("");
		assertEquals("", meeting.getComment());
	}
	
	@Test //test 29
	public void testSetCommentAbsurdValues() {
		String comm = "comment1 " +"comment2 "+"comment3 "+"comment4 "+"comment5 "+"comment6 "+"comment7 "+"comment8 "+
						"comment9 "+"comment10 "+"comment11 "+"comment12 "+"comment13 "+"comment14 "+"comment15 "+"comment16 "+
						"comment17 "+"comment18 "+"comment19 "+"comment20 "+"comment21 "+"comment22 "+"comment23 "+"comment24 "+
						"comment25 "+"comment26 "+"comment27 "+"comment28 "+"comment29 "+"comment30 "+"comment31 "+"comment32 "+
						"comment33 "+"comment34 "+"comment35 "+"comment36 "+"comment37 "+"comment38 "+"comment39 "+"comment40 "+
						"comment41 "+"comment42 "+"comment43 "+"comment44 "+"comment45 "+"comment46 "+"comment47 "+"comment48 "+
						"comment49 "+"comment50 "+"comment51 "+"comment52 "+"comment53 "+"comment54 "+"comment55 "+"comment56 "+
						"comment57 "+"comment58 "+"comment59 "+"comment60 "+"comment61 "+"comment62 "+"comment63 "+"comment64 "+
						"comment65 "+"comment66 "+"comment67 "+"comment68 "+"comment69 "+"comment70 "+"comment71 "+"comment72 "+
						"comment73 "+"comment74 "+"comment75 "+"comment76 "+"comment77 "+"comment78 "+"comment79 "+"comment80 "+
						"comment81 "+"comment82 "+"comment83 " + "comment1 " +"comment2 "+"comment3 "+"comment4 "+"comment5 "+"comment6 "+"comment7 "+"comment8 "+
						"comment9 "+"comment10 "+"comment11 "+"comment12 "+"comment13 "+"comment14 "+"comment15 "+"comment16 "+
						"comment17 "+"comment18 "+"comment19 "+"comment20 "+"comment21 "+"comment22 "+"comment23 "+"comment24 "+
						"comment25 "+"comment26 "+"comment27 "+"comment28 "+"comment29 "+"comment30 "+"comment31 "+"comment32 "+
						"comment33 "+"comment34 "+"comment35 "+"comment36 "+"comment37 "+"comment38 "+"comment39 "+"comment40 "+
						"comment41 "+"comment42 "+"comment43 "+"comment44 "+"comment45 "+"comment46 "+"comment47 "+"comment48 "+
						"comment49 "+"comment50 "+"comment51 "+"comment52 "+"comment53 "+"comment54 "+"comment55 "+"comment56 "+
						"comment57 "+"comment58 "+"comment59 "+"comment60 "+"comment61 "+"comment62 "+"comment63 "+"comment64 "+
						"comment65 "+"comment66 "+"comment67 "+"comment68 "+"comment69 "+"comment70 "+"comment71 "+"comment72 "+
						"comment73 "+"comment74 "+"comment75 "+"comment76 "+"comment77 "+"comment78 "+"comment79 "+"comment80 "+
						"comment81 "+"comment82 "+"comment83 "+"comment1 " +"comment2 "+"comment3 "+"comment4 "+"comment5 "+"comment6 "+"comment7 "+"comment8 "+
						"comment9 "+"comment10 "+"comment11 "+"comment12 "+"comment13 "+"comment14 "+"comment15 "+"comment16 "+
						"comment17 "+"comment18 "+"comment19 "+"comment20 "+"comment21 "+"comment22 "+"comment23 "+"comment24 "+
						"comment25 "+"comment26 "+"comment27 "+"comment28 "+"comment29 "+"comment30 "+"comment31 "+"comment32 "+
						"comment33 "+"comment34 "+"comment35 "+"comment36 "+"comment37 "+"comment38 "+"comment39 "+"comment40 "+
						"comment41 "+"comment42 "+"comment43 "+"comment44 "+"comment45 "+"comment46 "+"comment47 "+"comment48 "+
						"comment49 "+"comment50 "+"comment51 "+"comment52 "+"comment53 "+"comment54 "+"comment55 "+"comment56 "+
						"comment57 "+"comment58 "+"comment59 "+"comment60 "+"comment61 "+"comment62 "+"comment63 "+"comment64 "+
						"comment65 "+"comment66 "+"comment67 "+"comment68 "+"comment69 "+"comment70 "+"comment71 "+"comment72 "+
						"comment73 "+"comment74 "+"comment75 "+"comment76 "+"comment77 "+"comment78 "+"comment79 "+"comment80 "+
						"comment81 "+"comment82 "+"comment83 ";
		meeting.setComment(comm);
		assertEquals(comm, meeting.getComment());
	}
	
	
	
	
	

}
