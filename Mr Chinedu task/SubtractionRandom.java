import java.util.Random;
import java.util.Scanner;
public class SubtractionRandom{
public static void main (String [] args){

Random random = new Random();
Scanner scan = new Scanner(System.in);

int count = 0;
int correctCount = 0;
int userAnswer;
while (true){
	int number1 = random.nextInt(1, 10);
	int number2 = random.nextInt(1, 10);
	if(number1 > number2){
		int quotient = number1 - number2;
		int counter = 1;
		while (true){
			System.out.printf("What is %d - %d ? %n",number1, number2 );
			while(true){
				if (scan.hasNextInt()) {
  				  userAnswer = scan.nextInt();
 				  	break;
				} else {
    				System.out.println("That's not a valid integer!");
    				scan.next();
				System.out.printf("What is %d - %d ?",number1, number2 );
					}
				}
			if (userAnswer == quotient){
				correctCount += 1;
				break;
				}else{
					counter = counter + 1;
					if(counter > 2){
						break;
						}
					}
			}
		
		}else{
			continue;
			}
		count = count + 1;
		if(count == 10){
			break;
				}

	}
System.out.print("The total score is " + correctCount + "/" + count);

}		
}