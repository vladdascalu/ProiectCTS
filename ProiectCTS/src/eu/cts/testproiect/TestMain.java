package eu.cts.testproiect;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.cts.proiect.MainProc;
import eu.cts.proiect.Meeting;
import eu.cts.proiect.Task;

public class TestMain {
	String[] testStrings;
	FileReader fr;
	BufferedReader br;
	
	@BeforeClass
	public void setUpBeforeClass() throws Exception{
		fr = new FileReader("res/TestFileReadFromConsole.txt");
		br = new BufferedReader(fr);
		testStrings = br.readLine().split(",");
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		eu.cts.proiect.MainProc.isFinished = false;
	}

	//functia 1
	@Test //test 1
	public void testReadFromConsoleNumericValues1() throws IOException {
		assertEquals("Not working properly", testStrings[0], MainProc.readFromConsole());
	}
	
	@Test //test 2
	public void testReadFromConsoleNumericValues2(){
		assertEquals("Not working properly", testStrings[1], MainProc.readFromConsole());
	}
	
	@Test //test 3
	public void testReadFromConsoleNonNumericValues(){
		assertEquals("Not working properly", testStrings[2], MainProc.readFromConsole());
	}
	
	@Test //test 4
	public void testReadFromConsoleNonNumericValues2(){
		assertEquals("Not working properly", testStrings[3], MainProc.readFromConsole());
	}
	
	@Test //test 5
	public void testReadFromConsoleEmptyString(){
		assertEquals("", MainProc.readFromConsole());
	}
	
	@Test //test 6
	public void testReadFromConsoleSpecialChars(){
		assertEquals("\\n",MainProc.readFromConsole());
	}
	
	
	//functia 2
	@Test //test 7
	public void testChooseActivity(){
		assertTrue((MainProc.chooseActivity() instanceof Meeting) || (MainProc.chooseActivity() instanceof Task));
	}
}
