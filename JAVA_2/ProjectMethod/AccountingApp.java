import com.sun.jdi.Value;

public class AccountingApp {
	// ���ް���
	public static double valueOfSupply = 10000.0;
	// �ΰ���ġ����
	public static double valRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply * valRate;
	}

	public static double getTotal() {
		return valueOfSupply * getVAT();
	}
	
	public static void main(String[] args) {
		
		System.out.println("value of supply : " + valueOfSupply);
		// �ΰ���
		System.out.println("VAT : " + getVAT());
		// �հ�
		System.out.println("Total : " + getTotal());
		
	}

}
