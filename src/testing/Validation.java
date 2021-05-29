package testing;

public class Validation {
	public boolean verifb(int b) {
		return b != 0;

	}

	public int convert(String x) {
		return Integer.parseInt(x);

	}

	public boolean compare(int a, int b) {
		return a > b;

	}

	public boolean different(int a, int b)

	{
		if (a != b)
			return true;
		else
			return false;

	}

}
