package eu.cts.testproiect;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.cts.proiect.Activities;
import eu.cts.proiect.Activity;
import eu.cts.proiect.Factory;
import eu.cts.proiect.Meeting;
import eu.cts.proiect.Task;

public class TestFactory {

	Factory factory;
	Activity activity;
	
	@Before
	public void setUp() throws Exception {
		factory = new Factory();
	}

	@After
	public void tearDown() throws Exception {
		factory = null;
		activity = null;
	}

	//functia 5
	@Test //test 17
	public void testCreateActivityMeetingEnum() {
		activity = factory.createActivity(Activities.meeting);
		assertTrue(activity instanceof Meeting);
	}
	
	@Test //test 18
	public void testCreateActivityTaskEnum() {
		activity = factory.createActivity(Activities.task);
		assertTrue(activity instanceof Task);
	}

}
