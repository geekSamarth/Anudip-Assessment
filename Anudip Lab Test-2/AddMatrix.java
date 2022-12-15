public class AddMatrix {
    public static void main(String[] args) {
		int rows=2,col=3;
		int [][]arr1 = {{2,3,4},{5,2,3}};
		int [][]arr2 = {{-4,5,3},{5,6,3}};
		
		AddTwoMatrix(arr1,arr2,rows,col);

	}
	public static void AddTwoMatrix(int [][]arr1,int [][]arr2,int rows,int col) {
		int [][]sum = new int[rows][col];
		for(int i=0; i<rows;i++) {
			for(int j=0; j<col;j++) {
				sum[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		printMatrix(sum);
	}
	public static void printMatrix(int [][]sum) {
		System.out.println("Sum of two matrices is: ");
		for(int[] row: sum) {
			for(int col:row) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
	}

}
