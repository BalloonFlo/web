package 컬랙션;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		
		HashMap user = new HashMap();
		
		user.put(100, "김데이");
		user.put(200, "김사전");
		user.put(300, "김구조");
		user.put(400, "김자료");
		
		user.remove(200);
		user.replace(300, "김충성");
		
		System.out.println(user);

	}

}
