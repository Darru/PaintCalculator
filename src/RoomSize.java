
public class RoomSize
{
	private double wallWidth;
	private double wallHeight;
	
	public RoomSize (double width, double height)
	{
		wallWidth = width;
		wallHeight = height;
	}

	public double getWallWidth()
	{
		return wallWidth;
	}

	public void setWallWidth(double wallWidth)
	{
		this.wallWidth = wallWidth;
	}

	public double getWallHeight()
	{
		return wallHeight;
	}

	public void setWallHeight(double wallHeight)
	{
		this.wallHeight = wallHeight;
	}
}
