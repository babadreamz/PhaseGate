import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringCompareTest{
	@Test
	public void testStringComparefunctionWork(){
	String given = "Hello world";
	char givenChar = 'o';
	int expected = 2;
	int returned = StringCompare.letterOccur(given, givenChar) ;
	assertEquals(expected, returned);
	
	}

}