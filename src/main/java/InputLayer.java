public class InputLayer extends Layer {

    public void triggerCalculationInNodes(InputData inputData){

        System.out.println("----Inputlayer----");

        for (int i = 0; i < inputData.getSize(); i++) {
            double input = inputData.getValueByIndex(i);
            NetworkNode currentNode = nodes.get(i);
            currentNode.setOutput(input);
            System.out.println("Neuron mit Index " + i + ": " + currentNode.getOutput());
        }
    }


}
