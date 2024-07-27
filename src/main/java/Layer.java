import java.util.LinkedList;

public abstract class Layer {

    protected LinkedList<NetworkNode> nodes = new LinkedList<>();
    public void addNode(NetworkNode networkNode){
        nodes.add(networkNode);
    }


}
