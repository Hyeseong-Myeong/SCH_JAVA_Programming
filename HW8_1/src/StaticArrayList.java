public class StaticArrayList {
	public static void main(String[] args	) {
		for (int i = 1; i<5 ; i++) {
			new Rect(i, i+1);
		}
		
		for (Rect r : Rect.rectarr) {
	// rectarr 대신 Rect.all()을 사용하는 것이 더 좋음.
			System.out.println(r.width+", "+r.length+", "+r.getArea());
		}
	}
}