import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		// try with resource statements
		// 괄호 안에 close 필요한 클래스를 인스턴스화 시키는 코드를 넣음
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}