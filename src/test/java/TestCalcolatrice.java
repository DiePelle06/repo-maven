import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcolatrice 
{
	@Test
	void testSomma() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(5,6);
		
		assertEquals(11, res, 0);
	}
	
	@Test
	void testSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(6,6);
		
		assertEquals(12, res, 0);
	}
	
	@Test
	void testSommaNegativo() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(10,-5);
		
		assertEquals(45, res, 0);
	}
}
