public class Square implements Shape{
	//data member of the Square class
	int length;
	// parameterized Constructor for the square class
	Square(int length){
		this.length=length;
	}
	@Override // area method
	public int area() {
		return length*length;
	}

}