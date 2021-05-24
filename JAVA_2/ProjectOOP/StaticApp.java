class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	// static 붙으면 클래스 함수
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error
	}
	
	// static 없으면 인스턴스 함수 (객체를 생성시에만 사용 가능)
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}
	
}

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
//		Foo.instanceMethod(); // Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		f1.classMethod(); // class를 "참조" (class에 있는 함수 가리킴)
		f1.instanceMethod(); // class에 있는 인스턴스 함수를 "복제" (서로 독립된 존재)
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1"; // 참조 중이던 class 변수 자체를 변경
		System.out.println(f1.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1"; // f1에 복제된 인스턴스 변수만 변경
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
		
	}

}
