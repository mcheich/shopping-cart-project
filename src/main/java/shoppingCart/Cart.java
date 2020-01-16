package shoppingCart;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {

	private ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		
		items.add(item);
	}

	/**
	 * @return the items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	/**
	 * return the total number of orders in the Cart
	 * 
	 * @return int total number of orders in the Cart
	 */
	public int numOrders() {
		return items.size();
	}

	public void removeItem(String name) {
		Iterator<Item> itr = items.iterator();
		while(itr.hasNext()) {
			if(itr.next().getName().equals(name)) {
				itr.remove();
			}
		}
		
	}
/**
 * Gets total cost of all items in cart
 * @return total cost
 */

	public double getTotal() {
		double totalCost = 0;
		
		for(Item item : items) {
			totalCost += (item.getPrice() * item.getQuantity());
		}
		return totalCost;
	}
/**
 * Displays all orders to console
 */
	public void showOrders() {
		
		for(Item item: items) {
			System.out.println(item.toString());
		}
	}
	

	public void addOrder(String name, double price, int quantity) {
		Item newItem = new Item(name, price, quantity);
		items.add(newItem);
	}

}
