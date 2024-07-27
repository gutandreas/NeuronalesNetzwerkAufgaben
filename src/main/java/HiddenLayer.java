public class HiddenLayer extends Layer {

    public void triggerCalculationInNodes(){

        System.out.println("----Hiddenlayer----");

        for (int i = 0; i < nodes.size(); i++) {
            NetworkNode currentNode = nodes.get(i);
            currentNode.calculateOutput();
            System.out.println("Neuron mit Index " + i + ": " + currentNode.getOutput());
        }

    }
}
