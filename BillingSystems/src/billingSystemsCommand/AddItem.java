package billingSystemsCommand;


public class AddItem implements Stock {
	private Product product;
	
	public AddItem(Product product) {
		this.product = product;
	}
	
	@Override
	public void execute() {
		this.product.addItem();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
