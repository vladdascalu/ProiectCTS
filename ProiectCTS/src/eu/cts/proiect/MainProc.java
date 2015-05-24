package eu.cts.proiect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class MainProc {

	public static void main(String[] args) {
		LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": A inceput programul");
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
			boolean isFinished = false;
			while (!isFinished) {
				System.out.println("Doresti sa adaugi data pentru sedinta salvata? Da sau nu.");
				String buffer = readFromConsole();
				
				if (buffer.toLowerCase().equals("da")) {
					mb.setDate(readDateFromConsole());
					isFinished = true;
				} else if (buffer.toLowerCase().equals("nu"))
					isFinished = true;
			}
			isFinished = false;
			
			
			while (!isFinished) {
				System.out.println("Doresti sa adaugi descriere pentru sedinta salvata? Da sau nu.");
				String buffer = readFromConsole();
				
				if (buffer.toLowerCase().equals("da")) {
					mb.setComment(readFromConsole());
					LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": S-a adaugat comentariul: "+mb.meeting.getComment()+".");
					isFinished = true;
				} else if (buffer.toLowerCase().equals("nu"))
					isFinished = true;
			}
			isFinished = false;
			
			while (!isFinished) {
				System.out.println("Doresti sa adaugi prioritate pentru sedinta salvata? Da sau nu.");
				String buffer = readFromConsole();
				int prioritate;
				if (buffer.toLowerCase().equals("da")) {
					while (!isFinished){
						try{
							System.out.println("Prioritatea se noteaza de la 4 (neimportant) la 0 (foarte important).");
							prioritate = Integer.parseInt(readFromConsole());
							if (prioritate > -1 && prioritate < 5) {
								mb.setPriority(prioritate);
								LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": S-a adaugat prioritatea "+prioritate+".");
								isFinished = true;
							}
						} catch (Exception e){}
					}
					isFinished = true;
				} else if (buffer.toLowerCase().equals("nu"))
					isFinished = true;
			}
			isFinished = false;
			
			while (!isFinished) {
				System.out.println("Doresti sa adaugi participanti pentru sedinta salvata? Da sau nu.");
				String buffer = readFromConsole();
				
				if (buffer.toLowerCase().equals("da")) {
					System.out.println("Participantii vor fi despartiti prin virgula. Nu apasati ENTER pana cand nu terminati de adaugat toti participantii!");
					mb.setParticipants(readFromConsole());
					LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": S-au adaugat participantii: "+mb.meeting.getParticipants().toString()+".");
					isFinished = true;
				} else if (buffer.toLowerCase().equals("nu"))
					isFinished = true;
			}
			isFinished = false;
			
			while (!isFinished) {
				System.out.println("Doresti sa adaugi durata pentru sedinta salvata? Da sau nu.");
				String buffer = readFromConsole();
				
				if (buffer.toLowerCase().equals("da")) {
					System.out.println("Introduceti durata in minute.");
					mb.setDurationMillis((Integer.parseInt(readFromConsole())*60000));
					LoggerSingleton.ScrieLogInFisier(new Date(System.currentTimeMillis()).toString()+": S-a adaugat durata: "+mb.meeting.getDurationMillis()+".");
					isFinished = true;
				} else if (buffer.toLowerCase().equals("nu"))
					isFinished = true;
			}
			isFinished = false;
			
			activity = mb.build();
			
			
			
			System.out.println(activity.toString());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
		}
		else if (activity instanceof Task) {
			System.out.println("S-a creat o sarcina.");
			
			

		
		
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static Date readDateFromConsole(){
		Date readedDate = null;
		int an = -1, luna = -1, data = -1, ora = -1, minute = -1;

		
		while (an == -1){
			System.out.println("Introdu anul in cifre:");
			try {
			an = Integer.parseInt(readFromConsole()) - 1900;
			} catch (Exception e){
			}
		}		
			
		
		while (luna == -1 || luna > 12){
			System.out.println("Introdu luna in cifre:");
			try {
			luna = Integer.parseInt(readFromConsole());
			} catch (Exception e){
			}
		}
		
		
		int nrMaximZile;
		if(luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12)
			nrMaximZile = 31;
		else if (luna == 2)
			nrMaximZile = 28;
		else nrMaximZile = 30;
		
		while (data == -1 || data > nrMaximZile){
			System.out.println("Introdu data in cifre:");
			try {
			data = Integer.parseInt(readFromConsole());
			} catch (Exception e){
			}
		}
		
		
		while (ora == -1 || ora > 24){
			System.out.println("Introdu ora in cifre:");
			try {
				ora = Integer.parseInt(readFromConsole());
			} catch (Exception e){
			}
		}
		
		
		while (minute == -1 || minute > 59) {
			System.out.println("Introdu minutele in cifre:");
			try{
				minute = Integer.parseInt(readFromConsole());
			} catch (Exception e){
			}
		}
				
		readedDate = new Date(an+1, luna+1, data+1, ora+1, minute+1);
		LoggerSingleton.ScrieLogInFisier( new Date(System.currentTimeMillis()).toString()+": S-a adaugat data "+readedDate.toString());
		
		return readedDate;
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
