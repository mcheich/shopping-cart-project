package shoppingCart;

import java.awt.List;
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

	public double getTotal() {
		double totalCost = 0;
		
		for(Item item : items) {
			totalCost += item.getPrice();
		}
		return totalCost;
	}

	public void showOrders() {
		
		for(Item item: items) {
			System.out.println(item.toString());
		}
	}
}
