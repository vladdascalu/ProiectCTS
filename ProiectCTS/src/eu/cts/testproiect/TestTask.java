package eu.cts.testproiect;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.cts.proiect.Meeting;
import eu.cts.proiect.Task;

public class TestTask {

Task taskMock;
	
	Task task = new Task();

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception {
		taskMock = mock(Task.class);
		when(taskMock.getComment()).thenReturn("Fara comentarii");
		when(taskMock.getdateAndTime()).thenReturn(
				new Date(2015, 5, 4, 15, 55));
		when(taskMock.getDurationMillis()).thenReturn(600000L);
		when(taskMock.getPriority()).thenReturn(2);
	}

	@After
	public void tearDown() throws Exception {
		taskMock = null;
	}

	// functia 10 
	@Test //test 31
	public void testGetComment() {
		assertEquals("Comentariul nu coincide", "Fara comentarii",
				taskMock.getComment());
	}

	@SuppressWarnings("deprecation")
	@Test //test 32
	public void testGetDateAndTime() {
		assertEquals(new Date(2015, 5, 4, 15, 55), taskMock.getdateAndTime());
	}
	
	@Test //test 33
	public void testGetDurationMillis() {
		assertEquals(600000L, taskMock.getDurationMillis());
	}
	
	@Test //test 34
	public void testGetPriority(){
		assertEquals(2, taskMock.getPriority());
	}
}
