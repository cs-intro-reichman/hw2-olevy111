// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		String ver = (args[1]);
		String v = "v";
		int n = num;
		if (v.equals(ver))
		{
			for(int i=0; i<n; i++)
			{
				num = i+1;
				int x = 1;
				do
				{	
					System.out.print(num + " ");	
					if (num%2==0)
					{
						num = num/2;
					}
					else
					{
						num = (num*3)+1;
					}
					x = x+1;
				}	while (num!=1);
				System.out.print(num);
				System.out.println(" ("+ x + ")");
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		else
		{
			for(int i=0; i<n; i++)
			{
				num = i+1;
				int x = 1;
				do
				{	
						
					if (num%2==0)
					{
						num = num/2;
					}
					else
					{
						num = (num*3)+1;
					}
					x = x+1;
				}	while (num!=1);
				
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		
	}		
}


