package eu.cts.testproiect;

import static org.junit.Assert.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import eu.cts.proiect.Meeting;

public class TestMeeting {

	Meeting meeting;

	@Before
	public void setUp() throws Exception {
		meeting = mock(Meeting.class);
		when(meeting.getComment()).thenReturn("Fara comentarii");
	}

	@After
	public void tearDown() throws Exception {
		meeting = null;
	}

	//functia 3
	@Test
	public void testGetComment() {
		assertEquals("Comentariul nu coincide", "Fara comentarii", meeting.getComment());
	}

}
