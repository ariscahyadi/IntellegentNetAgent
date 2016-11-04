package intelligent.net.agent;

import org.apache.mina.statemachine.annotation.State;
import org.apache.mina.statemachine.annotation.Transition;

public class NodeStateHandler {
    @State public static final String OK = "Normal";
    @State public static final String ADJ = "Adjancies Problem";
    @State public static final String SW = "Software/Configuration Problem";

    @Transition(on = "ok2adj", in = OK, next = ADJ)
    public void ok2adj(String Msg) {
        System.out.println("ok2adj Transition");
    }

    @Transition(on = "adj2sw", in = ADJ, next = SW)
    public void adj2sw(String Msg) {
        System.out.println("adj2sw Transition");
    }

    @Transition(on = "ok2sw", in = OK, next = SW)
    public void ok2sw(String Msg) {
        System.out.println("ok2sw Transition");
    }

    @Transition(on = "sw2adj", in = SW, next = ADJ)
    public void sw2adj(String Msg) {
        System.out.println("sw2adj transition");
    }

    @Transition(on = "adj2ok", in = ADJ, next = OK)
    public void adj2okTape(String Msg) {
        System.out.println("adj2ok Transition");
    }

}