public class IndexSmall{

	public static int maxIndex(int[] num){
		int indexOfMax = 0;
		int maxValue = num[0];
		for(int index = 1; index < num.length; index++){
			if(num[index] > num[indexOfMax]){
				maxValue = num[index];
				indexOfMax = index;
			};			
		}
	return indexOfMax;
	}
}