package eu.cts.proiect;

import java.util.Date;

public class TaskBuilder {
	public Task task = new Task();
	
	public TaskBuilder setPriority(int priority){
		this.task.setPriority(priority);
		return this;
	}
	
	public TaskBuilder setDate(Date date){
		this.task.setdateAndTime(date);
		return this;
	}
	
	public TaskBuilder setDurationMillis(long durationMillis){
		this.task.setDurationMillis(durationMillis);
		return this;
	}
	
	public TaskBuilder setComment (String comm){
		this.task.setComment(comm);
		return this;
	}
	
	public Task build(){
		return this.task;
	}

}
