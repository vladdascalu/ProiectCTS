package eu.cts.proiect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class MainProc {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": a inceput programul");
		Factory factory = new Factory();
		Activity activity = null;
		String line = "";
		System.out.println("Creeaza o noua activitate:\nCe fel de activitate vrei sa creezi? Scrie sedinta pentru sedinta si sarcina pentru sarcina.");
		
		
		while (activity == null) {
			line = readFromConsole();
			if(line.toLowerCase().equals("sedinta"))
				activity = factory.createActivity(Activities.meeting);
			else if(line.toLowerCase().equals("sarcina"))
				activity = factory.createActivity(Activities.task);
			else
				System.out.println("Scrie sedinta pentru sedinta si sarcina pentru sarcina!");
			}
		
		
		if (activity instanceof Meeting) {
			System.out.println("S-a creat o sedinta.");
			LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": S-a creat o sedinta.");
			MeetingBuilder mb = new MeetingBuilder();
			
			mb.setDate(new Date(2015-1900, 5, 25, 11, 30));
			
			
			System.out.println("Doresti sa adaugi data pentru sedinta salvata? Da sau nu.");
			
			String buffer;
			buffer = readFromConsole();
			while (true) {
				if (buffer.toLowerCase().equals("da")){
					buffer = "";
					System.out.println("Introdu anul in cifre:");
					int an = Integer.parseInt(readFromConsole()) - 1900;
					System.out.println("Introdu luna in cifre:");
					int luna = Integer.parseInt(readFromConsole());
					
					
				} else if (buffer.toLowerCase().equals("nu"))
					continue;

			}
//			LoggerSingleton.ScrieLogInFisier( new Date(System.currentTimeMillis()).toString()+": S-a adaugat la sedinta data "+mb.meeting.getdateAndTime().toString());		
		}
		else if (activity instanceof Task) {
			System.out.println("S-a creat o sarcina.");
			
			

		
		
		}
		
		
		
		
		
	}
	
	
	
	
	public static String readFromConsole(){
		String s = "";
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    s = bufferRead.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return s;
	}
}
