// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double CalcPi = 0;
		int n = 0;
		for (int i=0 ; i<num ; i++)
		{
			CalcPi = CalcPi + (1.0/((2*n)+1))-(1.0/((2*n)+3));
			n = n+2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + CalcPi*4.0);
	}
}
