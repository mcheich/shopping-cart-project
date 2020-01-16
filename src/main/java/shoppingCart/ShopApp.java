package shoppingCart;

import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Cart cart = new Cart();

	}
	
	public void placeOrder() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the item:");
		String name = input.nextLine();
		System.out.println("Enter the unit price:");
		String price = input.nextLine();
		System.out.println("Enter the quauntity:");
		String quantity = input.nextLine();
		
	}

}
