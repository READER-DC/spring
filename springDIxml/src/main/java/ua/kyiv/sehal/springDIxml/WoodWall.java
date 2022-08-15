package ua.kyiv.sehal.springDIxml;

public class WoodWall implements WallMaterial {

	@Override
	public void cover() {
		System.out.println("Build a wall of logs!");		
	}

}
