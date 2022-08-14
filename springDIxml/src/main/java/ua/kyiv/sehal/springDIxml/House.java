package ua.kyiv.sehal.springDIxml;

public class House {
	private Window window;
	private int height;
	
	
	public House(Window window, int height) {
		super();
		this.window = window;
		this.height = height;
	}

	public House(Window window) {
		this.window = window;
	}
	

	public House() {
		
	}

	public void view() {
		window.open();
		
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
