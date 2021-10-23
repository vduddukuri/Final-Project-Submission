package billingSystemsCommand;


public class Product {
	private String name;
	private int quantity;
	
	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public void addItem()
	{
		System.out.println("Stock added for " + this.name + " by " + this.quantity);
	}
	
	public void removeItem()
	{
		System.out.println("Stock removed for " + this.name + " by " + this.quantity);
	}
}
