public class RotateArray{

	public static int[][] rotate(int[][] num){
		int[][] num = new int[num.length][num[0].length];
		for(int index = 0; index < num.length; index++){
			int control = 2;
			for(int count = 0; count < num[index].length; count++){
				empty[index][count] = num[control][index];
				control--;
				}
			}		
		return empty;
		}


}