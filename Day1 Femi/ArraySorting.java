public class ArraySorting{

	public static int[] sorting(int[] numbers){
		int[] result = new int[numbers.length];
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