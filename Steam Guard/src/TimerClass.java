import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class TimerClass {
	static int secondsPassed;
	static int secon =5;
	static Random r = new Random();

	public int getSecondsPassed() {
		return secondsPassed;
	}

	public void setSecondsPassed(int secondsPassed) {
		this.secondsPassed = secondsPassed;
	}

	public TimerClass(int secondsPassed) {
		super();
		this.secondsPassed = secondsPassed;

	}

	Timer timer = new Timer();
	static TimerTask task = new TimerTask() {
		public void run() {
			char[] array = new char[26];
			for (int i = 0; i < 5; i++) {
				array[i] = (char) (r.nextInt(26) + 97);

				System.out.print(array[i]);
			}
			System.out.println("");
		}
	};
	static Timer timer1 = new Timer();
	static TimerTask task1 = new TimerTask() {
		public void run() {
			secondsPassed++;
			secon--;
			System.out.println("Time left: " + secon);
			if(secon==0) {
				secon = 5;
			}
		}
	};
	public static void start1() {
		timer1.scheduleAtFixedRate(task1, 1000, 1000);
	}
	public static void main() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, 0, 5000);
	}
}
