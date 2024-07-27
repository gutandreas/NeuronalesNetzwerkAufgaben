import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        

        NetworkNode a = new NetworkNode();
        NetworkNode b = new NetworkNode();
        NetworkNode c = new NetworkNode();
        NetworkNode d = new NetworkNode();
        NetworkNode e = new NetworkNode();
        NetworkNode f = new NetworkNode();
        NetworkNode g = new NetworkNode();
        NetworkNode h = new NetworkNode();
        NetworkNode i = new NetworkNode();

        InputLayer inputLayer = new InputLayer();
        inputLayer.addNode(a);
        inputLayer.addNode(b);
        inputLayer.addNode(c);
        inputLayer.addNode(d);
        inputLayer.addNode(e);
        inputLayer.addNode(f);
        inputLayer.addNode(g);
        inputLayer.addNode(h);
        inputLayer.addNode(i);

        NetworkNode j = new NetworkNode();
        NetworkNode k = new NetworkNode();

        HiddenLayer hiddenLayer = new HiddenLayer();
        hiddenLayer.addNode(j);
        hiddenLayer.addNode(k);

        LinkedList<HiddenLayer> hiddenLayers = new LinkedList<>();
        hiddenLayers.add(hiddenLayer);

        NetworkNode l = new NetworkNode();
        NetworkNode m = new NetworkNode();

        OutputLayer outputLayer = new OutputLayer();
        outputLayer.addNode(l);
        outputLayer.addNode(m);

        NeuralNetwork neuralNetwork = new NeuralNetwork(inputLayer, hiddenLayers, outputLayer);

        double[][] weightsArrayInputLayerHiddenLayer = {
                {0.94, -0.84},
                {-0.62, 0.95},
                {-0.56, 0.78},
                {-0.43, 0.84},
                {0.82, -0.83},
                {-0.72, 0.84},
                {-0.99, 0.0},
                {-0.75, 0.82},
                {-0.43, 0.77}
        };

        double[][] weightsArrayHiddenLayerOutputLayer = {
            {-0.87, 0.98},
            {0.63, -0.99}
        };

        neuralNetwork.connectLayersWithEdges(inputLayer, hiddenLayers.get(0), weightsArrayInputLayerHiddenLayer);
        neuralNetwork.connectLayersWithEdges(hiddenLayers.get(0), outputLayer, weightsArrayHiddenLayerOutputLayer);

        double inputArrayZahl0[][] = {
                {1.0, 1.0, 1.0},
                {1.0, 0.0, 1.0},
                {1.0, 1.0, 1.0}};

        double inputArrayZahl1[][] = {
                {1.0, 1.0, 0.0},
                {0.0, 1.0, 0.0},
                {0.0, 1.0, 0.0}};

        InputData inputData = new InputData(inputArrayZahl1);

        neuralNetwork.startCalculation(inputData);

    }


}
