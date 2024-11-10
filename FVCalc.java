public class FVCalc {
	public static void main(String[] args){
        int CV = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double reasult1 = 1+(rate/100);
		double result2 = Math.pow(reasult1, years);	
	    double FV = CV*result2;
		System.out.println("After " + years + " years, a $" + CV + " saved at " + rate + "% will yield $" + (int)FV);
	}
}  