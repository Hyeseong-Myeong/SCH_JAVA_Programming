
public class BoxWeight extends Box {
	int weight;
	
	BoxWeight()	{
		super();
		weight = -1;
	}
	BoxWeight(int w, int l, int h, int m)	{
		super(w, l, h);
		this.weight = m;
	}
	BoxWeight(int l, int m)	{
		super(l);
		this.weight = m;
	}
	double cost()	{
		return getVol() * weight;
	}
}
