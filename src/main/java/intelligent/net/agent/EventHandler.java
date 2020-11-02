package intelligent.net.agent;

public class EventHandler {

	public static String EventStateOK (String event) {
	
		String keyOK2ADJ = "down";
		String keyOK2SW = "shut";
		
		String Transition = "";
		
		if (event.contains(keyOK2ADJ)) {
			Transition = "ok2adj";
		} else if (event.contains(keyOK2SW)) {
			Transition = "ok2sw";
		} else {
			Transition = "";
			System.out.println("no transition, not valid event for this state");
		}
		return Transition;
}
	
	public static String EventStateADJ (String event) {
		
		String keyADJ2SW = "shut";
		String keyADJ2OK = "up";
		String Transition = "";
		
		if (event.contains(keyADJ2SW)) {
			Transition = "adj2sw";
		} else if (event.contains(keyADJ2OK)) {
			Transition = "adj2ok";
		} else {
			Transition = "";
			System.out.println("no transition, not valid event for this state");
		}
		return Transition;
}
	
	public static String EventStateSW (String event) {

		String keySW2ADJ = "active";
		String Transition = "";
		

		if (event.contains(keySW2ADJ)) {
			Transition = "sw2adj";
		} else {
			Transition = "";
			System.out.println("no transition, not valid event for this state");
		}
		return Transition;
}
}