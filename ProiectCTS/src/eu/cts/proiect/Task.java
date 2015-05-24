package eu.cts.proiect;

public class Task extends Activity{
	private int priority;
	private long durationMillis;
	private String comment;

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
