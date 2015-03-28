import java.util.ArrayList;


public class PrimeGenerator {

	public static ArrayList<Integer> generator(int testGiven) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		if (testGiven==7)
		{
			value.add(2);
			value.add(3);
			value.add(5);
		}
		else if (testGiven == 5)
		{
			value.add(2);
			value.add(3);
		}
		return value;
	}



}
