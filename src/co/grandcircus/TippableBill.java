package co.grandcircus;

public class TippableBill extends Bill {

	double tip;

	public TippableBill() {

	}

	public TippableBill(double subTotal, double taxRate, double tip) {

	}

	@Override
	public double calcTotal() {

//		return super.calcTotal() + tip;
		return getSubtotal() * (1 + getTaxRate()) + tip;
	}

}
