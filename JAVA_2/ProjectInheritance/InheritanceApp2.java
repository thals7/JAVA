class Cal_2 {
	int v1, v2;
	Cal_2(int v1, int v2) {
		System.out.println("Cal init!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}

class Cal3_2 extends Cal_2 {
	// �����ڰ� �ִ� Ŭ������ ��ӹ��� ��� �����ڸ� ����� �θ� Ŭ������ �ݵ�� ȣ���ؾ��� 
	Cal3_2(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!");	
	}
	public int minus() {return this.v1-v2;}
}
public class InheritanceApp2 {
	public static void main(String[] args) {
		Cal_2 c= new Cal_2(2,1);
		Cal3_2 c3 = new Cal3_2(2,1);
		System.out.println(c3.sum()); // 3
		System.out.println(c3.minus()); // 1
	}
}
