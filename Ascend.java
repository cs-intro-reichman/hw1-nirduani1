public class Ascend {
	public static void main(String[] args) {
	int lim = Integer.parseInt(args[0]);
	int a = (int)(Math.random()*lim);
	int b = (int)(Math.random()*lim);
	int c = (int)(Math.random()*lim);
	int MinNum = Math.min(a,Math.min(b,c));
	int MaxNum = Math.max(a,Math.max(b,c));
	int MidNum = a+b+c-MinNum-MaxNum;
	System.out.println("In the range:[0,"+lim+")"+ "the three random numbers is: "+a+ " "+b+" "+c);
	System.out.println("The three numbers in ascendin order: "+MinNum+" "+MidNum+" "+MaxNum);
	}
}
