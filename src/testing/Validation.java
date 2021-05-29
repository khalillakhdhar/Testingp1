package testing;

public class Validation {
	public boolean verifb(int b) {
		return b != 0;

	}
	public boolean verifPoid(int poid)
	{
		return poid>30;
	}
public boolean veriftaille(double taille)
{
return taille>1.3;	

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
	public boolean paire(int p)
	{
		
		return p%2==0;
	}
	public boolean verifchaine(String ch)
	{
		return !ch.isBlank();
	}

}
