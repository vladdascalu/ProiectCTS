package eu.cts.proiect;

import java.util.Date;
import java.util.List;

public class MeetingBuilder {
	Meeting meeting = new Meeting();
	
	
	public MeetingBuilder setParticipants(List<String> participants){
		this.meeting.setParticipants(participants);
		return this;
	}
	
	public MeetingBuilder setPriority(int priority){
		this.meeting.setPriority(priority);
		return this;
	}
	
	public MeetingBuilder setDurationMillis(long durationMillis){
		this.meeting.setDurationMillis(durationMillis);
		return this;
	}
	
	public MeetingBuilder setDate (Date date){
		this.meeting.setdateAndTime(date);
		return this;
	}
	
	public MeetingBuilder setComment (String comm){
		this.meeting.setComment(comm);
		return this;
	}
	
	public Meeting build(){
		return this.meeting;
	}
	
	
}
