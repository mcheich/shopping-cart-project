package shoppingCart;

public class Item {

	private String name;
	private double price;
	private int quantity;

	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.setQuantity(quantity);
	}

	public Object getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
