public class RotateArray{

	public static int[][] rotate(int[][] num){
		int[][] empty = new int[num.length][];
		int control = 2;
		for(int index = 0; index < num.length; index++){
			for(int count = 0; count < num[index].length; count++){
				empty[ount][control] = num[control][index];
				control--;
				}
			}		
		return empty;
		}


}