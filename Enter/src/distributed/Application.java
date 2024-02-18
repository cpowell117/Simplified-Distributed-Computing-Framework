package distributed;

import distributed.core.MasterNode;

public class Application {
    public static void main(String[] args) {
        MasterNode masterNode = new MasterNode();
        masterNode.distributeTasks("Example Job");
    }
}
