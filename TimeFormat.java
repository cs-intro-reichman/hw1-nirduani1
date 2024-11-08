public class TimeFormat {
	public static void main(String[] args) {
        String time = args [0];
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        if(hours>12&&minutes>=10){System.out.print(hours-12 + ":" + minutes + " PM");}
		else if(hours>12&&minutes<10){System.out.print(hours-12 + ":0" + minutes + " PM");}
		else if(hours<12&&minutes>=10){System.out.print(hours +":" + minutes + " AM");}
		else if(hours<12&&minutes<10){System.out.print(hours + ":0" + minutes + " AM");}
		else if(hours==12&&minutes>=10){System.out.print(hours +":" + minutes + " PM");}
		else if(hours==12&&minutes<10){System.out.print(hours + ":0" + " PM");}
	}
}