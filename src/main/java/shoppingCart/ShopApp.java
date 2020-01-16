package shoppingCart;

import java.util.Scanner;

public class ShopApp {

	private static Cart cart = new Cart();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int option = 0;

		showGreeting();

		do {
			showOptions();
			option = input.nextInt();

			switch (option) {
			case 1:
				placeOrder();
				break;
			case 2:
				removeOrder();
				break;
			case 3:
				showOrdersMessage();
				cart.showOrders();
				System.out.println("Total Price: $" + String.format("%.2f", cart.getTotal()) + "\n");
				break;
			case 4:
				System.exit(0);
				break;
			}
			
		} while (option != 4);

		input.close();
	}

	private static void removeOrder() {
		System.out.println("What item would you like to remove?");
		String name = input.next();
		cart.removeItem(name);
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
		System.out.println("1. Add an item to my cart.");
		System.out.println("2. Remove an item by name.");
		System.out.println("3. Show the contents of my cart.");
		System.out.println("4. Exit program.");

	}

	/**
	 * Prompts user to input item details Adds item to cart.
	 * 
	 * @param None
	 * @return None
	 */
	public static void placeOrder() {
//		Scanner input = new Scanner(System.in);

		System.out.println("##################################################");
		System.out.println("##  Enter your order info at the prompt below.  ##");
		System.out.println("##################################################\n");

		System.out.println("Enter the name of the item:");
		String name = input.next();
		System.out.println("Enter the unit price:");
		double price = input.nextDouble();
		System.out.println("Enter the quantity:");
		int quantity = input.nextInt();

		cart.addOrder(name, price, quantity);
//		input.close();
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
