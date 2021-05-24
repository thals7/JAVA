import com.sun.jdi.Value;

public class AccountingApp {
	// 공급가액
	public static double valueOfSupply = 10000.0;
	// 부가가치세율
	public static double valRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply * valRate;
	}

	public static double getTotal() {
		return valueOfSupply * getVAT();
	}
	
	public static void main(String[] args) {
		
		System.out.println("value of supply : " + valueOfSupply);
		// 부가세
		System.out.println("VAT : " + getVAT());
		// 합계
		System.out.println("Total : " + getTotal());
		
	}

}
