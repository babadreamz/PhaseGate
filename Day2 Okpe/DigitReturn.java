public class DigitReturn{

	public static boolean returnNum(String[] num){
		boolean isRight = true;
		for(int index = 0; index < num.length; index++){
			int counter = 0;
			for(int count = 0; count < num.length; count++){
			if(num[index] == num[count]){
				counter++;
				}	
			}
		if(num[counter] == num[index]){
				isRight = false;
				} else{isRight = true;}
		}
	if(isRight){
		return true;
		}else{return false;}
	}
}