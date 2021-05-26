import java.io.FileWriter;
import java.io.IOException;

// CheckException -> �ݵ�� try catch �������
public class CheckedExceptionApp {
	public static void main(String[] args) {
		FileWriter f = null;
		try{
			f = new FileWriter("data.txt");
			f.write("Hello");
			// close�� �ϱ� �� �� ���� �ڵ忡�� ���ܰ� �߻��� �� �ֱ� ������ finally�� ó���ؾ� ��
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���� f�� null�� �ƴ϶��
			if(f != null) {
				try {
					f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}