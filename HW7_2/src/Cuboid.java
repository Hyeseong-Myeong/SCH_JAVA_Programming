
public class Cuboid {
	int width;
	int length;
	int height;
	
	Cuboid()	{
		this.width = -1;
		this.length = -1;
		this.height = -1;
	}
	Cuboid(int w, int l, int h)	{
		this.width = w;
		this.length = l;
		this.height = h;
	}
	Cuboid(int l)	{
		this.width = l;
		this.height = l;
		this.length = l;
	}
	Cuboid(Cuboid b)	{
		this.width = b.width;
		this.length = b.length;
		this.height = b.height;
	}
	
	double getVol()	{
		return width * length * height;
	}
}
