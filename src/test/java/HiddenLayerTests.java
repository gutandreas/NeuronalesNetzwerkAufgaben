import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class HiddenLayerTests {

    @Test
    public void testTriggerCalculationInNodes(){
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


        NeuralNetwork neuralNetwork = new NeuralNetwork(inputLayer, hiddenLayers, null);

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

        double inputArrayZahl[][] = {
                {1.0, 1.0, 1.0},
                {1.0, 0.0, 1.0},
                {1.0, 1.0, 1.0}};

        InputData inputData = new InputData(inputArrayZahl);

        inputLayer.triggerCalculationInNodes(inputData);
        hiddenLayer.triggerCalculationInNodes();

        double result1 = 0.027652422322823136;
        double result2 = 0.9846322944347244;

        Assertions.assertEquals(result1, j.getOutput());
        Assertions.assertEquals(result2, k.getOutput());
    }
}
