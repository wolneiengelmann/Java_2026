package util;

public class CurrencyConverter {

	public double dollarCot;
	public double valueBought;
	public static final double IOF = 6;

	public static double realPaid(double dollarCot, double valueBought) {
		double total = (valueBought*dollarCot);
			double	percentIof=total*IOF/100;
			return total+percentIof;
	}
}
