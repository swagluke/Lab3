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
		Integer[] second = {2, 3};
		Integer[] third = {2,3,5};
		return Arrays.asList(new Object [] [] 
				{{1, new ArrayList<Integer>(Arrays.asList(first))},
				 {5, new ArrayList<Integer>(Arrays.asList(second))},
				 {7, new ArrayList<Integer>(Arrays.asList(third))}
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