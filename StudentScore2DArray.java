public class StudentScore2DArray{

	public static double[][] totalScores(double[][] scores){
	double totalRow = 0;
	double totalCol = 0;
	for(int row = 0; row < scores.length; row++){
		totalRow = totalRow + scores[row];
		for(int col = 0; col < scores.length; col++){
			totalCol = totalCol+ scores[col];
			}
		}
	return  totalRow;
	}

}