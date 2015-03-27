import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int canadidate = 2;i > 1;canadidate++) {
			for (; i % canadidate == 0; i /= canadidate) {
				primes.add(canadidate);
			}
		}
		return primes;
	}

}
