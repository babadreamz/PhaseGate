import java.util.Arrays;
public class RotateArrayDriver{
public static void main(String [] args){
	int[][] num = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			};
	int[][] num2 = {
			{3,4,5},
			{4,5,6}
			};
	System.out.print(Arrays.deepToString(RotateArray.rotate(num2)));
	}
}