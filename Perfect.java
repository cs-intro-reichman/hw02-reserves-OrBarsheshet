/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
        String Divisors = "1";
        int sum = 1;
        for (int i= 2; i < n; i++) {
            if (n%i==0){
                Divisors = Divisors + " + " + i; 
                sum = sum + i;
            }
        }
        if (n == sum){
        System.out.println(n + " is a perfect number since " + n + " = " + Divisors);
        }
        else {
           System.out.println(n + " is not a perfect number");
        }
		}
}
