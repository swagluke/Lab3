import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int canadidate = 2;
		while (i > 1) {
			for (; i % canadidate == 0; i /= 2) {
				primes.add(canadidate);
			}
			canadidate++;
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}

}
