public class HiddenLayer extends Layer {

    public void triggerCalculationInNodes(){

        System.out.println("----Hiddenlayer----");

        //TODO: Aufgabe 6) Ergänze die Methode so, dass alle NetworkNodes aus der Klasse geladen und deren Methode
        //                 calculateOutput() aufgerufen wird. Gib für jeden Node das Outputsignal in der Konsole aus
        for (int i = 0; i < nodes.size(); i++) {
            NetworkNode currentNode = nodes.get(i);
            currentNode.calculateOutput();
            System.out.println("Neuron mit Index " + i + ": " + currentNode.getOutput());
        }

    }
}
