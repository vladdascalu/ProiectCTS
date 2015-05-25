package eu.cts.testproiect;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestFactory.class, TestLoggerSingleton.class,
		TestMeeting.class, TestTask.class })
public class AllTestsNoConsoleInput {

}
