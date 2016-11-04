package intelligent.net.agent;

public interface NodeState {
    void ok2adj(String Msg);
    void adj2ok(String Msg);
    void sw2adj(String Msg);
	void adj2sw(String Msg);
	void ok2sw(String Msg);
}