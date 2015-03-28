import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeGeneratorTest {

	int testGiven;
	ArrayList<Integer> testReturned;

	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		Integer[] first = {};
		Integer[] second = {2,3};
		Integer[] third = {2,3,5};
		Integer[] fourth = {2, 3, 5, 7, 11};
		Integer[] fifth = {2,3,5,7,11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97};
		return Arrays.asList(new Object [] [] 
				{{1, new ArrayList<Integer>(Arrays.asList(first))},
				 {5, new ArrayList<Integer>(Arrays.asList(second))},
				 {7, new ArrayList<Integer>(Arrays.asList(third))},
				 {13, new ArrayList<Integer>(Arrays.asList(fourth))},
				 {100, new ArrayList<Integer>(Arrays.asList(fifth))}
				});
	}

	public PrimeGeneratorTest(int given, ArrayList<Integer> returned) {
		testGiven = given;
		testReturned = returned;
	}
	@Test
	public void realTest() {
		assertEquals(testReturned, PrimeGenerator.generator(testGiven));
	}
}