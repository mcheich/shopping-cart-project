package shoppingCart;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartTest {

	@Test
	public void Add1ItemToCart() {
		// Arrange
		Cart underTest = new Cart();
		Item item = new Item("Bike", 2500, 1);
		// Act
		underTest.addItem(item);
		int result = underTest.numOrders();
		// Assert
		assertEquals(1, result);
	}

	@Test
	public void Add2ItemsToCart() {
		// Arrange
		Cart underTest = new Cart();
		Item item1 = new Item("Bike", 2500, 1);
		Item item2 = new Item("Running Shoes", 120, 1);
		// Act
		underTest.addItem(item1);
		underTest.addItem(item2);
		int result = underTest.numOrders();
		// Assert
		assertEquals(2, result);
	}

	@Test
	public void remove1ItemFromCart() {
		// Arrange
		Cart underTest = new Cart();
		Item item1 = new Item("Bike", 2500, 1);
		Item item2 = new Item("Running Shoes", 120, 1);
		// Act
		underTest.addItem(item1);
		underTest.addItem(item2);
		underTest.removeItem("Running Shoes");
		int result = underTest.numOrders();
		// Assert
		assertEquals(1, result);
	}

	@Test
	public void remove2ItemFromCart() {
		// Arrange
		Cart underTest = new Cart();
		Item item1 = new Item("Bike", 2500, 1);
		Item item2 = new Item("Running Shoes", 120, 1);
		Item item3 = new Item("candy", 23, 64);
		// Act
		underTest.addItem(item1);
		underTest.addItem(item2);
		underTest.addItem(item3);
		underTest.removeItem("Running Shoes");
		underTest.removeItem("Bike");
		int result = underTest.numOrders();
		// Assert
		assertEquals(1, result);
	}

	@Test
	public void CartTotals123Dollars() {
		// Arrange
		Cart underTest = new Cart();
		Item item1 = new Item("Bike", 100, 1);
		Item item2 = new Item("Running Shoes", 20, 1);
		Item item3 = new Item("candy", 3, 64);
		// Act
		underTest.addItem(item1);
		underTest.addItem(item2);
		underTest.addItem(item3);
		double result = underTest.getTotal();
		// Assert
		assertTrue(123 == result);
	}

	@Test
	public void CartTotals120Dollars() {
		// Arrange
		Cart underTest = new Cart();
		Item item1 = new Item("Bike", 100, 1);
		Item item2 = new Item("Running Shoes", 20, 1);
		Item item3 = new Item("candy", 3, 64);
		// Act
		underTest.addItem(item1);
		underTest.addItem(item2);
		underTest.addItem(item3);
		underTest.removeItem("candy");
		double result = underTest.getTotal();
		// Assert
		assertTrue(120 == result);
	}

	@Test
	public void toStringReturnsFormattedString() {
		// Arrange
		Item item = new Item("Bike", 100, 1);
		//Act
		String result = item.toString();
		System.out.println(result);
		//Assert
		assertEquals("Item: Bike                 price: $100.00               Qty: 1", result);
	}
	
	@Test
	public void addOrderAdds1ItemToOrder() {
		//Arrange
		Cart underTest = new Cart();
		String name = "Bike";
		double price = 2500;
		int quantity = 1;
		//Act
		underTest.addOrder("Bike",price,quantity);
		//Assert
		assertEquals(1, underTest.numOrders());
	}
	
	@Test
	public void addOrderAddsCorrectToOrder() {
		//Arrange
		Cart underTest = new Cart();
		String name = "Bike";
		double price = 100;
		int quantity = 1;
		//Act
		underTest.addOrder("Bike",price,quantity);
		//Act
		String result = underTest.getItems().get(0).toString();
		System.out.println(result);
		//Assert
		assertEquals("Item: Bike                 price: $100.00               Qty: 1", result);
	}
	
	
//	@Test
//	public void showOrdersShouldDisplayToConsole() {
//		Cart underTest = new Cart();
//		Item item1 = new Item("Bike", 100, 1);
//		Item item2 = new Item("Running Shoes", 20, 1);
//		Item item3 = new Item("candy", 3, 64);
//		// Act
//		underTest.addItem(item1);
//		underTest.addItem(item2);
//		underTest.addItem(item3);
//		
//		underTest.showOrders();
//	}

}
