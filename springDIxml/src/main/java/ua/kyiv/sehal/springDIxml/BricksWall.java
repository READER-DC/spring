package ua.kyiv.sehal.springDIxml;

public class BricksWall implements WallMaterial{

	@Override
	public void cover() {
		System.out.print("Build a brick wall!");		
	}
	

}
