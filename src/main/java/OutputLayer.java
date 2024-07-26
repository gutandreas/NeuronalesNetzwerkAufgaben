public class OutputLayer extends Layer {

    public void startCalculation(){
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
