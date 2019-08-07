package co.grandcircus;

public class RestaurantApp {

	public static void main(String[] args) {
		Bill bill = new Bill(15.80, 0.06);
		pay(bill);
//		double subTotal = 15.80;
//		double taxRate = 0.06;
		// double bill1 = (subTotal * taxRate) + subTotal;
		// System.out.println(bill1);
		TippableBill tipBill = new TippableBill(8.50, 0.06, 2.0);
		pay(tipBill);

	}

	public static void pay(Bill bill) {

		System.out.println("$" + bill.calcTotal());

		return;
	}

}
