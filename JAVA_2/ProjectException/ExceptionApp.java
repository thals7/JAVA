public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값을 찾고 계시네요.");
		}
		try {
			System.out.println(2);
			System.out.println(2/0);
			System.out.println(3); // 실행되지 않음
		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산이네요.");
		}
		System.out.println(4);
		
		try {
//			System.out.println(3/0);
			System.out.println(scores[4]);
		} catch (ArithmeticException e){
			System.out.println("잘못된 계산이네요.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
}
