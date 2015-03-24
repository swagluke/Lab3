import static org.junit.Assert.*;

import org.junit.Test;


public class Lab3Test {

	@Test
	public void testOne() {
        assertEquals(list(), PrimeFactos.generate(1));
	}
}
