import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IndexSmallTest{
	@Test
	public void 
	IndexSmallFunction(){
	int[] given = {1,2,8,20,5};
	int expected = 3;	
	int returned = IndexSmall.maxIndex(given);
	assertEquals(expected, returned);
	}



}