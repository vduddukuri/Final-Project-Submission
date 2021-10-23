package billingSystemsFactory;

public class BillStore {
	BillingFactory billingFactory;
	
	public BillStore(BillingFactory billingFactory) {
		this.billingFactory = billingFactory;
	}
	
	public Bills billStatus(String type) {
		Bills bill;
		bill = billingFactory.createBill(type);
		bill.billType();
		bill.billDate();
		bill.billAmount();
		
		return bill;
		
	}
}
