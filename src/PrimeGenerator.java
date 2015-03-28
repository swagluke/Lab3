import java.util.ArrayList;


public class PrimeGenerator {

	public static ArrayList<Integer> generator(int testGiven) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		for (int i =2;i < testGiven; i ++)
		{
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++)
			{
				if (i%j == 0)
				{
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber)
				value.add(i);
		}
		return value;
	}



}
