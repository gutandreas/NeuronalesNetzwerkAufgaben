public class NetworkEdge {

    private final NetworkNode from;
    private final NetworkNode to;
    private double weight;

    // TODO: Aufgabe 3) Impelementiere einen Konstruktor, der die Parameter 'from', 'to' und 'weight' den Instanzvariablen zuweist
    public NetworkEdge(NetworkNode from, NetworkNode to, double weight) {
        this.from = null; // =null verhindert Fehleranzeige und muss ersetzt werden...
        this.to = null; // =null verhindert Fehleranzeige und muss ersetzt werden...
        this.weight = 0.0; // =0.0 verhindert Fehleranzeige und muss ersetzt werden...
    }

    public NetworkNode getFrom() {
        return from;
    }

    public double getWeight() {
        return weight;
    }

}
