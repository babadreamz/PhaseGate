public class UniqueArray{

	public static int arraySum(int[] number){
		int sum = 0;
		for(int index = 0; index < number.length; index++){
			for(int count = 0; count < number.length; count++){
				if(index != number[count] && number[index] == number[count]){
					   sum =  number[count];
					
					}
				} 
				sum++;
			}	
		return sum;
	}


}