package billingSystemsState;

public class CheckPendingBillsState implements State{
	Bill bill;
	public CheckPendingBillsState(Bill bill) {
		this.bill = bill;
	}
	@Override
	     // TODO Auto-generated method stub
	public void addBill() {
		
		System.out.println("Bill added");
	}
	@Override
	     // TODO Auto-generated method stub
	public void removeBill() {
		
		System.out.println("Bill removed");
	}

	@Override
	public void checkPendingBills() {
		// TODO Auto-generated method stub
		System.out.println("One pending bill");
	}

	@Override
	public void selectBillingMethod() {
		// TODO Auto-generated method stub
		System.out.println("No method selected");
	}

	@Override
	public void verifyPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment method not verified");
	}
	
}
