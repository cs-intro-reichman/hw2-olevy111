// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String N =  args[0]; 
                int rows = Integer.parseInt(args[1]);
                String BN = N.toUpperCase();
                String letter = "AEFHILMNORSX";
                for (int i=0 ; i<BN.length(); i++)
                {
                        char c = BN.charAt(i);
                        if (letter.indexOf(c)!= -1)
                        {
                        System.out.println("Give me an " + BN.charAt(i) + ": " + BN.charAt(i) + "!");
                        }
                        else
                        {
                        System.out.println("Give me a  " + BN.charAt(i) + ": " + BN.charAt(i) + "!");      
                        }
                }
                System.out.println("What does that spell?");
                for (int i=0 ; i<rows ; i++)
                {
                        System.out.println(BN + "!!!");
                }
                

        }
}
