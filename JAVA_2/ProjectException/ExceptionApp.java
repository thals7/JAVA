public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ���� ã�� ��ó׿�.");
		}
		try {
			System.out.println(2);
			System.out.println(2/0);
			System.out.println(3); // ������� ����
		} catch(ArithmeticException e) {
			System.out.println("�߸��� ����̳׿�.");
		}
		System.out.println(4);
		
		try {
//			System.out.println(3/0);
			System.out.println(scores[4]);
		} catch (ArithmeticException e){
			System.out.println("�߸��� ����̳׿�.");
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}
