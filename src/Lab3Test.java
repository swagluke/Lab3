import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;



public class Lab3Test {

	private  List<Integer> list(Integer...intergers) {
		return Arrays.asList(intergers);
	}
	@Test
	public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
	}

	@Test
	public void testTwo() throws Exception {
        assertEquals(list(2), PrimeFactors.generate(2));
	}
}
