public class Calcolatrice 
{
	public double somma(double...addendi)
	{
		double s = 0;
		for(double addendo : addendi)
		{
			//s = s + Math.abs(addendo);
			s = s + addendo;
		}
		
		return s;
	}
}
