
public class WhyMethod {

	public static void main(String[] args) {
					// 인자, argument
		printTwoTimes("a", "&");
		printTwoTimes("a", "*");
		printTwoTimes("b", "!");
		

	}
									// 매개변수, parameter
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

}
