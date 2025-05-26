public class ArraySquareSorting{

	public static int[] squareSorting(int[] numbers){
		if(numbers.length == 0 || numbers == null){
			throw new IllegalArgumentException("Array cannot be empty");
			}	
	for(int counter = 0; counter < numbers.length; counter++){
		int temp2 = numbers[counter] * numbers[counter];
		numbers[counter] = temp2; 
		}
	for(int index = 0; index < numbers.length; index++){
		for(int count = 0; count <(numbers.length - index)-1; count++){
			if(numbers[count] > numbers[count + 1]){
				int temp = numbers[count];
				numbers[count] = numbers[count + 1];
				numbers[count + 1] = temp;
				}	
			}
		}
	return numbers;
	}

}