// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double CalcPi = 0;
		int n = 1;
		for (int i=0 ; i<num ; i++)
		{
			double sum = (1.0/n)-(1.0/(n+2.0));
			CalcPi = CalcPi + sum;
			n = n+4;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + CalcPi*4.0);
	}
}
