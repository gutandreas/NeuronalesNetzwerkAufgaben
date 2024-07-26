import java.util.LinkedList;

public class Layer {

    protected LinkedList<NetworkNode> nodes = new LinkedList<>();
    public void addNode(NetworkNode networkNode){
        nodes.add(networkNode);
    }


}
