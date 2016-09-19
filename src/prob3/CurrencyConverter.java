package prob3;

public class CurrencyConverter {
	private static double rate;
	
	public static void setRate(double r) {
		rate = r;
	}

	public static double toDollar(int i) {
		double d = i /rate;
		return d;
	}

	public static double toKRW(int i) {
		double d = i * rate;
		return d;
	}

}
