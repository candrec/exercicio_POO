package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double converte(int quantidade,double dollar) {
		return (dollar*quantidade*IOF)+(dollar*quantidade);
	}
}
