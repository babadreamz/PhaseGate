public class AddSort{

	public static int[] addSort(int[] num1, int[] num2){

		for(int index = 0; index < arraySum.length; index++){
			for(int count = 0; count <(arraySum.length - index)-1; count++){
			if(arraySum[count] < arraySum[count + 1]){
				int temp = arraySum[count];
				arraySum[count] = arraySum[count + 1];
				arraySum[count + 1] = temp;
				}	
			}
		}
	return arraySum;
	}


}