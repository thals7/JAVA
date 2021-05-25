class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	// Overloading (형태만 다르다면 같은 이름의 함수 여러개 만들 수 있음)
	// 상속과는 상관 X
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2)+v3;
	}
}

class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// Overriding 부모 클래스의 기능에 올라타서 덮어씀(재정의)
	public int sum(int v1, int v2) {
		System.out.println("Cal3!");
		// super -> 부모 클래스 Cal을 가리킴
		return super.sum(v1,v2);
	}
}

public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2,1));
		System.out.println(c.sum(2,1,1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,1));
		System.out.println(c3.minus(2,1));
	}

}