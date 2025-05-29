public class StringCompare{
	
	public static int letterOccur(String word, char ch){
		String NewWord = word.toLowerCase();
		int count = 0;
		for(int index = 0; index < (word.length() - 1); index++){
			if(NewWord.charAt(index) == ch){
				count++;
				}	
			
			}	
		return count;
		}
	
	
}