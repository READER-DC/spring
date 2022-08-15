package ua.kyiv.sehal.springDIxml;

public class House {
	private Window window;
	private int height;
	private WallMaterial wall;
	
	
	public House() {
	}

	public House(Window window) {
		this.window = window;
	}
	
	public House(Window window, int height) {
		super();
		this.window = window;
		this.height = height;
	}

	public void view() {
		window.open();
	}
	
	public void buildWall() {
		for(int i = 1; i <= getHeight(); i++) {
			System.out.printf("Этаж %-4d", i);
			getWall().cover();
			System.out.println("-" + wall);
		}
	}
	
	public WallMaterial getWall() {
		return wall;
	}

	public void setWall(WallMaterial wall) {
		this.wall = wall;
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
