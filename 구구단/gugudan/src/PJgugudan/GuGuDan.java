package PJgugudan;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class GuGuDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println(1);
		int random,random2;
		int score = 0;
		while( score < 100) {
			random = (int)(Math.random()*9)+2;
			random2 = (int)(Math.random()*9)+2;
			System.out.println( random + " * " + random2 + " ? " );
			int result = sc.nextInt();
			if(random*random2 == result) {
				score += 10;
				System.out.println("현재 스코어 : " + score);
			}else {
				System.out.println("틀렸습니다");
			}
			
		}
		
		
		Timer timerS = new Timer();
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
