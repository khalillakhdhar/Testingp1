package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Testing {
Validation valider;
@Before
public void initialise()
{
valider=new Validation();	
}

@Test
public void testchaine()
{
	assertTrue(valider.verifchaine(" Ali "));
}
@Test
public void testparite()
{
assertEquals(true,valider.paire(12));	
}
@Test
public void verifpoid()
{
assertEquals(true, valider.verifPoid(70));
}
	
	
}
