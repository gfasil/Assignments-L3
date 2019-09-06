package L3HW;

public final class Triangle {
	
	private final double base;
	private final double height;
	
	
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
		
	}
	public double getbase() {
		return base;
	}
		public double getHeight() {
		return height;
	}
	
	public double computeArea(double x,double y) {
		
		return 0.5*(x*y);
	}
	

}
