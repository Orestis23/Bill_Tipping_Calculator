package co.grandcircus;

public class Bill {

	double subtotal;
	double taxRate;

	Bill() {

	}

	Bill(double subtotal, double taxRate) {

	}

	public double calcTotal() {
		double calcTotal = (subtotal * (1 + taxRate));
		return calcTotal;

	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double tippableBill() {
		// TODO Auto-generated method stub
		return 0;
	}

}
