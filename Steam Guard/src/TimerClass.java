import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class TimerClass {
	static int secondsPassed;
	static int secon =6;
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

	static Timer timer1 = new Timer(); // progrm měl od začátku odpočítavat od 5 do 1
	static TimerTask task1 = new TimerTask() {
		public void run() {
			secondsPassed++;
			secon--;
			if(secon==0) {
				char[] array = new char[26];
				for (int i = 0; i < 5; i++) {
					array[i] = (char) (r.nextInt(26) + 97);
					System.out.print(array[i]);
				}
				System.out.println("");
				secon = 5;
			}
			System.out.println("Time left: " + secon + " sec." );
			
		}
	};
	public static void start1() {
		timer1.scheduleAtFixedRate(task1, 1000, 1000);
	}
	
}
/*
 * účelem originálního programu (podle mě) bylo odpočítat od 5 do 1 a pak vypsat
 * náhodných 5 pímen. Zdůvodu dvou timerů ktreří běželi současně, dělal program
 * neplechu (2. timer předbýhal 1.).takže jsem program upravil,
 aby pracocal jen s jedním timerem. Plus program nejdříve odpočítával od 4 do 0.
  
 */