package eu.cts.testproiect;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.cts.proiect.LoggerSingleton;

public class TestLoggerSingleton {

	LoggerSingleton logger;
	
	@Before
	public void setUp() throws Exception {
		logger = LoggerSingleton.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	//functia 9
	@Test //test 30
	public void testGetInstance() {
		assertEquals(logger, LoggerSingleton.getInstance());
	}

	@Test //test 31
	public void testScrieLogInFisier() {
		String log = "testLog";
		LoggerSingleton.ScrieLogInFisier(log);
		String line = "";
		String fin="";
		FileReader fr;
		try {
			fr = new FileReader("res/logs.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine())!=null){
				fin = line;
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(log, fin);
	}
}
