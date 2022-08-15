package ua.kyiv.sehal.springDIxml;

public class MainWindow {
	
	private MainWindow() {
	}
	
	private static class MainWindowHolder {
		static MainWindow instance = new MainWindow();
	}
	
	public static MainWindow getInstance() {
		return MainWindowHolder.instance;
	}
	
	public void show() {
		System.out.println("Object class singletone MainWindow - " + getInstance());	
	}
	
	public void openConnection() {
		System.out.println("MainWindow open connecnion");
	}
	
	public void closeConnection() {
		System.out.println("MainWindow close connecnion");
	}

}
