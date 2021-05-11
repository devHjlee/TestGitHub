import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestGitHub {
	private void syso() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		BigDecimal abinAmt = new BigDecimal("3000");
		BigDecimal org = new BigDecimal("300");
		BigDecimal tod = new BigDecimal("500");
		
		
		System.out.println(abinAmt.subtract(org.subtract(tod)));
		
		System.out.println("1");
		
		if(true) {
			returnTest();
			System.out.println("a");
		}
		
		System.out.println("2");
		
		if(true) {
			System.out.println("b");
		}

		System.out.println("3");
		
		
		
		
		
	}
	
	public static void returnTest() {
		System.out.println("test");
	}
}
