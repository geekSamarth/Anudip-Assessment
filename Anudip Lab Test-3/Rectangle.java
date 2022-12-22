public class Rectangle extends Square{
	//data member of rectangle class
	int width;
	// parameterized constructor for rectangle class
	Rectangle(int length,int width){
		super(length);
		this.width = width;
	}
	// area method to calculate the area of the rectangle
	public int area() {
		return length*width;
	}
}