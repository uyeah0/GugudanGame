package PJgugudan;

import java.util.Timer;
import java.util.TimerTask;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(1);
		
		int random = (int)Math.random()*100+1;
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println( i + " * " + j + " = " +i*j);
			}
		}
//		Timer timerS = new Timer();
//		
//		
//		
//		TimerTask take = new TimerTask() {
//			public  void run() {
//				System.out.println(2);
//				timerS.cancel();
//			}
//		};
//		timerS.schedule(take,3000);
	}

}
