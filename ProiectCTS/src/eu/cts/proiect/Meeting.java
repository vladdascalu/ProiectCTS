package eu.cts.proiect;

import java.util.List;

public class Meeting extends Activity{
	private List<String> participants = null;
	private int priority;
	private long durationMillis;
	private String comment;

	public List<String> getParticipants() {
		return participants;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public long getDurationMillis() {
		return durationMillis;
	}

	public void setDurationMillis(long durationMillis) {
		this.durationMillis = durationMillis;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
