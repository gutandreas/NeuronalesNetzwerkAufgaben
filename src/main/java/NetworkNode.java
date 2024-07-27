import java.util.LinkedList;

public class NetworkNode {

    private double output;
    private final LinkedList<NetworkEdge> inputEdges = new LinkedList<>();
    private final LinkedList<NetworkEdge> outputEdges = new LinkedList<>();


    public void addInputEdge(NetworkEdge edge){
        inputEdges.add(edge);
    }
    public void addOutputEdge(NetworkEdge edge){
        outputEdges.add(edge);
    }

    //TODO: Aufgabe 4) Berechne den Output mit der Sigmoid-Funktion und setze die Instanzvariable 'output' auf das Resultat
    public void calculateOutput(){

    }

    public void setOutput(double output){
        this.output = output;
    }

    public double getOutput(){
        return output;
    }






}
