package ui;

import businessLogic.OrderHandlingController;

public class Program {

	public static void main(String[] args) {

		// Opens main window
		MainWindow main = new MainWindow(OrderHandlingController.getInstance()); 
		main.setVisible(true);
	}
}
