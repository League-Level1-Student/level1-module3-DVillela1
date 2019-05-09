package cow_timer;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Make a CowTimer, set its time and start it. Use a short delay (seconds) when
		 * testing, then try with longer delays
		 */
		CowTimer tm = new CowTimer();
		tm.setTime(1);
		tm.start();
	}
}
