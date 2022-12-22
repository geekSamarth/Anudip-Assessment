public class ShapeMain {

	public static void main(String[] args) {
		// instance of the rectangle class
		Rectangle rec =  new Rectangle(6,4);
		// instance of the Square class
		Square sq =  new Square(8);
		//printing out the area of rectangle
		System.out.println("Area of rectangle is : "+rec.area());
		//printing out the area of square
		System.out.println("Area of Square is : "+sq.area());
	}

}