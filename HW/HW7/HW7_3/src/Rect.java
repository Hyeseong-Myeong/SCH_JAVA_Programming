
public class Rect {
	int width;
	int lenght;
	
	Rect()	{
		this.width = -1;
		this.lenght = -1;
	}
	Rect(int w, int l)	{
		this.width = w;
		this.lenght = l;
	}
	Rect(int l) {
		this.lenght = l;
		this.width = l;
	}
	double getArea() {
		return width * lenght;
	}
}
