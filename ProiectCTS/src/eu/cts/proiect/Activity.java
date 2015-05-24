package eu.cts.proiect;

import java.util.Date;

public abstract class Activity {
	private Date dateAndTime;

	public Date getdateAndTime() {
		return dateAndTime;
	}

	public void setdateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
}
