package billingSystemsFactory;

import org.junit.*;
public class FactoryTest {
	BillingFactory billingFactory = new BillingFactory();
	BillStore billStore = new BillStore(billingFactory);
	@Test
	public void testBillType() {
		Bills bill = billStore.billStatus("Utility");
		System.out.println("Bill Type is: "+ bill.getBillType()+"\n");
		
		bill = billStore.billStatus("Subscription");
		System.out.println("Bill Type is: "+ bill.getBillType()+"\n");
	}

}
