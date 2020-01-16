package shoppingCart;

import java.util.Scanner;

public class ShopApp {

	private static Cart cart = new Cart();

	public static void main(String[] args) {
	
		showGreeting();
		
		
		Scanner input = new Scanner(System.in);
		
		
	    placeOrder();
		showOrdersMessage();
	    cart.showOrders();
		System.out.println("Total Price: $" + cart.getTotal() + "\n");
		showOptions();

	}

	private static void showOrdersMessage() {
		System.out.println("#########################################");
		System.out.println("##  These are the items in your cart:  ##\n");
	}

	/**
	 * Displays user options to console
	 */
	private static void showOptions() {
		
		System.out.println("What would you like to do?");
		
	}

	/**
	 * Prompts user to input item details Adds item to cart.
	 * 
	 * @param None
	 * @return None
	 */
	public static void placeOrder() {
		Scanner input = new Scanner(System.in);

		System.out.println("##################################################");
		System.out.println("##  Enter your order info at the prompt below.  ##");
		System.out.println("##################################################\n");

		System.out.println("Enter the name of the item:");
		String name = input.nextLine();
		System.out.println("Enter the unit price:");
		double price = input.nextDouble();
		System.out.println("Enter the quantity:");
		int quantity = input.nextInt();

		cart.addOrder(name, price, quantity);
	}

	/**
	 * Display store name and Tag line
	 * 
	 * @param none
	 * @return nothing
	 */
	public static void showGreeting() {
		System.out.println("###########################################");
		System.out.println("##       Welcome to Console Store.       ##");
		System.out.println("##  The place where YOU name the price!  ##");
		System.out.println("###########################################\n");
	}

}
