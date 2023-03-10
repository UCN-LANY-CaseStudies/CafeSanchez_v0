package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Order;
import model.Product;

public class OrderHandlingController {

	// singleton
	private static OrderHandlingController instance;

	public static OrderHandlingController getInstance() {

		if (instance == null) {

			instance = new OrderHandlingController();
		}
		return instance;
	}

	private OrderHandlingController() { // constructor is private to enforce singleton

		// Loading products data from file
		try {
			File productsFile = new File("Products.txt");
			Scanner reader = new Scanner(productsFile);

			while (reader.hasNextLine()) {
				String[] data = reader.nextLine().split(";");

				products.add(new Product(data[0], Float.parseFloat(data[1])));
			}
			reader.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	// data
	private List<Product> products = new ArrayList<Product>();
	private List<Order> orders = new ArrayList<Order>();

	public List<Order> getUnfinishedOrders() {

		List<Order> result = new ArrayList<Order>();
		for (Order order : orders) {
			if (order.getStatus() != Order.STATUS_FINISHED) {
				result.add(order);
			}
		}
		return result;
	}

	public boolean createNewOrder(Order order) {
		order.setStatus(Order.STATUS_NEW);
		orders.add(order);
		return true;
	}

	public List<Product> getProducts() {

		return products;
	}

	public boolean changeOrderState(Order order) {

		switch (order.getStatus()) {
			case Order.STATUS_NEW:
				order.setStatus(Order.STATUS_ACTIVE);
				break;
			case Order.STATUS_ACTIVE:
				order.setStatus(Order.STATUS_READY);
				break;
			case Order.STATUS_READY:
				order.setStatus(Order.STATUS_FINISHED);
				break;
			default:
				return false;
		}
		return true;
	}
}
