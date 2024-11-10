public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int ones = number%10 ;
		int tens = ((number-ones)/10)%10 ;
		int hundreds = (number-tens*10-ones)/100 ;
		System.out.println("For the number: " + number);
		System.out.println(hundreds + " hundreds, "+ tens +" tens, and " + ones + " ones.");
	}
}
