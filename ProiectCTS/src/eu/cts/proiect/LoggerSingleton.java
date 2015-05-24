package eu.cts.proiect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerSingleton {
	private static LoggerSingleton instance = null;
	
	private LoggerSingleton() {
	}
	
	public static synchronized LoggerSingleton getInstance(){
		if (instance == null)
			instance = new LoggerSingleton();
		
		return instance;
	}
	
	public static void ScrieLogInFisier(String log){
		getInstance();
		log.trim();
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("res/logs.txt", true)))) {
		    out.println(log);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
