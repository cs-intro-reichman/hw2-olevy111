// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double CalcPi = 0.0;
		double formula;
		for (int i=0 ; i<num ; i++)
		{
			formula = 1.0/((2*i)+1);
			if(i%2==0)
			{
				CalcPi = CalcPi + formula;
			}
			else
			{
				CalcPi = CalcPi - formula;
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + CalcPi*4.0);
	}
}
