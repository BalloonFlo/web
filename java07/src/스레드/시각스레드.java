package 스레드;

import java.util.Date;

public class 시각스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println(date);
			//cpu 1초 stop
			//자바에서 cpu 연결
			//자바에서 외부 자원을 연결할 때는 위험하다는 상황이다.
			//위험한 상황(에러가 발생해서 프로그램이 멈추는 위험한 상황)
			//--> 대응책 코딩해주어야 한다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	
	}
}
