public class NetworkEdge {

    private final NetworkNode from;
    private final NetworkNode to;
    private double weight;

    // TODO: Aufgabe 3) Impelementiere einen Konstruktor, der die Parameter 'from', 'to' und 'weight' den Instanzvariablen zuweist
    public NetworkEdge(NetworkNode from, NetworkNode to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public NetworkNode getFrom() {
        return from;
    }

    public double getWeight() {
        return weight;
    }

}
