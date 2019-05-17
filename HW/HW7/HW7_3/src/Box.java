
public class Box extends Rect {
	int height;
	
	Box() {
		super();
		this.height = -1;
	}
	Box(int w, int l, int h)	{
		super.lenght = l;
		super.width = w;
		this.height = h;
	}
	Box(int l)	{
		super(l);
		this.height = l;
	}
	double getVol()	{
		return getArea() * this.height;
	}
}
