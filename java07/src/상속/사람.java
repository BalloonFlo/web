package 상속;

//extends object은 생략
//모든 클래스는 묵시적으로 object클래스를 상속받음
//모든 클래스는 8개의 메서드를 가지고 시작한다.
public class 사람 extends 상속사용 { //8개 메서드
	//멤버변수 2개 추가
	String gender;
	String name;
	int size;
	
	//멤버메서드 2개 추가
	public void 잠자다() {
		System.out.println("잠자다.");
	}
	public void 먹다() {
		System.out.println("먹다.");
	}
	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + ", size=" + size + "]";
	}
	

	
	
}
