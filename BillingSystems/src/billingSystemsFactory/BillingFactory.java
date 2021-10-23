package billingSystemsFactory;




public class BillingFactory {
	public Bills createBill(String type) {
		Bills bill = null;
		if(type.equals("Utility")) {
		     bill = new UtilityBill();
		}else if(type.equals("Subscription")) {
			bill = new Subscription();
		}
		return bill;
	}
}
