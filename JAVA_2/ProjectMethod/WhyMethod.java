
public class WhyMethod {

	public static void main(String[] args) {
					// ����, argument
		printTwoTimes("a", "&");
		printTwoTimes("a", "*");
		printTwoTimes("b", "!");
		

	}
									// �Ű�����, parameter
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

}
