package root;

public class Point {
	private int x, y;
	
	public static double dist(Point a, Point b) {
		return Math.sqrt( (a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y) );
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
