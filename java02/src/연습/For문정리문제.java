package 연습;

public class For문정리문제 {

	public static void main(String[] args) {
		//문제1-1
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
		}
		System.out.println(sum);	
		
		//문제1-2
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);		
		
		//문제1-3
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
		
		System.out.println("-------------");
		
		//문제2
		int sum4 = 0;
		for (int i = 1; i <= 1000; i = i + 3) {				
			if (sum4 >= 100) {
				break; //break를 포함하고 있는 블록을 종료.
			}
			if (i % 5 == 0) {
				continue; //5의 배수 skip.
			}
			sum4 = sum4 + i;
		}
		System.out.println(sum4);

		//문제3
	}

}
