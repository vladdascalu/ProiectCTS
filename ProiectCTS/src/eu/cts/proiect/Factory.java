package eu.cts.proiect;

public class Factory {
	public Activity createActivity (Activities a){
		Activity activity = null;
		switch (a) {
			case meeting:
				activity = new Meeting();
				break;

			case task:
				activity = new Task();
				break;
		}
		
		return activity;
		
	}
}
