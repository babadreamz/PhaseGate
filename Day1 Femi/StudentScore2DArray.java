public class StudentScore2DArray{

	public int[][] getTotal(int[][] scores){
	int[] arrayTotal = new int[scores[0].length];
	for(int row = 0; row < scores.length; row++){
		int total = 0;
		for(int col = 0; col < scores[col].length; col++){
			total += scores[row][col];
			}
		arrayTotal[row] = total;
		}
	return arrayTotal;
	}

}