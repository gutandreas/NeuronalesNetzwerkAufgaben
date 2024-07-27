import java.util.LinkedList;

public class NeuralNetwork {

    private InputLayer inputLayer;
    private LinkedList<HiddenLayer> hiddenLayers;
    private OutputLayer outputLayer;

    public NeuralNetwork(InputLayer inputLayer, LinkedList<HiddenLayer> hiddenLayers, OutputLayer outputLayer) {
        this.inputLayer = inputLayer;
        this.hiddenLayers = hiddenLayers;
        this.outputLayer = outputLayer;
    }

    public void startCalculation(InputData inputData){
        inputLayer.triggerCalculationInNodes(inputData);
        for (int i = 0; i < hiddenLayers.size(); i++) {
            hiddenLayers.get(i).triggerCalculationInNodes();
        }
        outputLayer.triggerCalculationInNodes();
    }

    public void connectLayersWithEdges(Layer layer1, Layer layer2, double[][] weights){
        LinkedList<NetworkNode> inputNodes = layer1.nodes;
        LinkedList<NetworkNode> outputNodes = layer2.nodes;

        for (int i = 0; i < inputNodes.size(); i++) {
            NetworkNode inputNode = inputNodes.get(i);
            for (int j = 0; j < outputNodes.size(); j++) {
                NetworkNode outputNode = outputNodes.get(j);
                NetworkEdge networkEdge = new NetworkEdge(inputNode, outputNode, weights[i][j]);
                outputNode.addInputEdge(networkEdge);
                inputNode.addOutputEdge(networkEdge);
            }
        }
    }
}
