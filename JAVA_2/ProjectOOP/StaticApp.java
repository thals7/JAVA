class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	// static ������ Ŭ���� �Լ�
	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error
	}
	
	// static ������ �ν��Ͻ� �Լ� (��ü�� �����ÿ��� ��� ����)
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
		
		f1.classMethod(); // class�� "����" (class�� �ִ� �Լ� ����Ŵ)
		f1.instanceMethod(); // class�� �ִ� �ν��Ͻ� �Լ��� "����" (���� ������ ����)
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1"; // ���� ���̴� class ���� ��ü�� ����
		System.out.println(f1.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1"; // f1�� ������ �ν��Ͻ� ������ ����
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
		
	}

}
