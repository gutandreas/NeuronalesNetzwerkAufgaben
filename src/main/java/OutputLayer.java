public class OutputLayer extends Layer {

    // TODO: Aufgabe 7) Implementiere die Methode so, dass der Output aller Knoten berechnet und ausgegeben wird.
    //                  Zudem soll der Index des Knotens mit dem höchsten Output und der Outputwert ausgegeben werden.
    public void triggerCalculationInNodes(){
        double maxOutput = 0;
        int maxOutputIndex = 0;

        System.out.println("----Outputlayer----");

        for (int i = 0; i < nodes.size(); i++) {
            NetworkNode currentNode = nodes.get(i);
            currentNode.calculateOutput();
            double output = currentNode.getOutput();
            if (output > maxOutput){
                maxOutput = output;
                maxOutputIndex = i;
            }

            System.out.println("Neuron mit Index " + i + ": " + output);
        }

        System.out.println("Maximaler Output bei Neuron mit Index " + maxOutputIndex + " und Wert " + maxOutput);
    }
}
