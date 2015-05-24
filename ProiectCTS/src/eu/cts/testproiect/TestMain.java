package eu.cts.testproiect;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.cts.proiect.Activity;
import eu.cts.proiect.Factory;
import eu.cts.proiect.MainProc;
import eu.cts.proiect.Meeting;
import eu.cts.proiect.Task;

public class TestMain {
	String[] testStrings;
	@Before
	public void setUp() throws Exception {
		FileReader fr = new FileReader("res/TestFileReadFromConsole.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		testStrings = br.readLine().split(",");
	}

	@After
	public void tearDown() throws Exception {
		eu.cts.proiect.MainProc.isFinished = false;
	}

	//functia 1
	@Test
	public void testReadFromConsoleNumericValues1() throws IOException {
		assertEquals("Not working properly", testStrings[0], MainProc.readFromConsole());
	}
	
	@Test
	public void testReadFromConsoleNumericValues2(){
		assertEquals("Not working properly", testStrings[1], MainProc.readFromConsole());
	}
	
	@Test
	public void testReadFromConsoleNonNumericValues(){
		assertEquals("Not working properly", testStrings[2], MainProc.readFromConsole());
	}
	
	@Test
	public void testReadFromConsoleNonNumericValues2(){
		assertEquals("Not working properly", testStrings[3], MainProc.readFromConsole());
	}
	
	@Test
	public void testReadFromConsoleEmptyString(){
		assertEquals("", MainProc.readFromConsole());
	}
	
	@Test
	public void testReadFromConsoleSpecialChars(){
		assertEquals("\\n",MainProc.readFromConsole());
	}
	
	
	//functia 2
	@Test
	public void testChooseActivity(){
		assertTrue((MainProc.chooseActivity() instanceof Meeting) || (MainProc.chooseActivity() instanceof Task));
	}
}
