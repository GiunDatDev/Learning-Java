public class Rec_Solve {
	private double length;
	private double width;
	private double rec_area;
	private double rec_perimeter;
	
	public Rec_Solve(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public void print_rectangle_information() {
		System.out.println("The length of the rectangle is: " + this.length);
		System.out.println("The width of the rectangle is: " + this.width);
	}
	
	public double find_area() {
		this.rec_area = this.length * this.width;
		return this.rec_area;
	}
	
	public double find_perimeter() {
		this.rec_perimeter = (this.length + this.width) * 2;
		return this.rec_perimeter;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getRec_area() {
		return rec_area;
	}

	public void setRec_area(double rec_area) {
		this.rec_area = rec_area;
	}

	public double getRec_perimeter() {
		return rec_perimeter;
	}

	public void setRec_perimeter(double rec_perimeter) {
		this.rec_perimeter = rec_perimeter;
	}
}
