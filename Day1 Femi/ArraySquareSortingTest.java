import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraySquareSortingTest{

	@Test
	public void testArraySquareSortingWorks(){
		
	int[] given = {9,0,-7,0,-5};
	int[] expected = {0,0,25,49,81};	
	int[] returned = ArraySquareSorting.squareSorting(given);
	assertArrayEquals(expected, returned);
	}
	public void testIfArrayErrorWorks(){
		
	}


}