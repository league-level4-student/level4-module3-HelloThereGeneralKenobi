package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double d1, double d2) {
		if(d2 == 0) {
			throw new IllegalArgumentException();
		}
		else {
			return d1/d2;
		}
	}
	
	String reverseString(String s) {
		if(s.length() == 0) {
			throw new IllegalStateException();
		}
		else {
			String sReverse = "";
			
			for(int i = s.length() - 1; i >= 0;i--) {
				sReverse = sReverse + s.charAt(i);
			}
			
			return sReverse;
		}
	}
}
