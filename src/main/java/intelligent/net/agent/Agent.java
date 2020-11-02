package intelligent.net.agent;

import java.io.IOException;

import org.apache.mina.statemachine.StateMachine;
import org.apache.mina.statemachine.StateMachineFactory;
import org.apache.mina.statemachine.StateMachineProxyBuilder;
import org.apache.mina.statemachine.annotation.Transition;

public class Agent {

	public static void main(String[] args) throws IOException {
		NodeStateHandler handler = new NodeStateHandler();
		StateMachine sm = StateMachineFactory.getInstance(Transition.class).create(NodeStateHandler.OK, handler);
		NodeState state = new StateMachineProxyBuilder().create(NodeState.class, sm);
		String nodestatus = "OK";
		
		String[] events = LogReader.FileReader();
		String event ="";
		
		int numberOfEvents = events.length;
		
		for (int i = 0; i < numberOfEvents ; i++) {
			event = events[i];
			System.out.println(event);
			System.out.println(nodestatus);
				
			String Transition = "";
		
			if (nodestatus.equals("OK")) {
				Transition = EventHandler.EventStateOK(event);
			
			} else if (nodestatus.equals("ADJ")) {
				Transition = EventHandler.EventStateADJ(event);
			
			} else if (nodestatus.equals("SW")) {
				Transition = EventHandler.EventStateSW(event);
			
			} else {
				System.out.println("not valid state");
			}
		
			switch (Transition) {
				case "" : break;
    			case "ok2adj": state.ok2adj(""); nodestatus = "ADJ"; SendStatus.writeToFile(nodestatus,event);break;
    			case "adj2sw": state.adj2sw(""); nodestatus = "SW"; SendStatus.writeToFile(nodestatus,event);break;
    			case "sw2adj": state.sw2adj(""); nodestatus = "ADJ"; SendStatus.writeToFile(nodestatus,event);break;
    			case "adj2ok": state.adj2ok(""); nodestatus = "OK"; SendStatus.writeToFile(nodestatus,event);break;
    			case "ok2sw": state.ok2sw(""); nodestatus = "SW"; SendStatus.writeToFile(nodestatus,event);break;
			}
		}
	}
}
