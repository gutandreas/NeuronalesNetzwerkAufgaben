import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Erstellen der Nodes für den InputLayer
        NetworkNode a = new NetworkNode();
        NetworkNode b = new NetworkNode();
        NetworkNode c = new NetworkNode();
        NetworkNode d = new NetworkNode();
        NetworkNode e = new NetworkNode();
        NetworkNode f = new NetworkNode();
        NetworkNode g = new NetworkNode();
        NetworkNode h = new NetworkNode();
        NetworkNode i = new NetworkNode();

        // Erstellen des InputLayers und Hinzufügen der Input Nodes
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

        // Erstellen der Nodes für den HiddenLayer
        NetworkNode j = new NetworkNode();
        NetworkNode k = new NetworkNode();

        // Erstellen des HiddenLayers und Hinzufügen der Hidden Nodes
        HiddenLayer hiddenLayer = new HiddenLayer();
        hiddenLayer.addNode(j);
        hiddenLayer.addNode(k);

        // Erstellen der LinkedList für HiddenLayers und hinzufügen der HiddenLayers (hier nur 1 Schicht)
        LinkedList<HiddenLayer> hiddenLayers = new LinkedList<>();
        hiddenLayers.add(hiddenLayer);

        // Erstellen der Nodes für den OutputLayer
        NetworkNode l = new NetworkNode();
        NetworkNode m = new NetworkNode();

        // Erstellen des OutputLayers und Hinzufügen der Output Nodes
        OutputLayer outputLayer = new OutputLayer();
        outputLayer.addNode(l);
        outputLayer.addNode(m);

        // Erstellen des Neuronalen Netzes und Übergabe der Layer über den Konstruktur
        NeuralNetwork neuralNetwork = new NeuralNetwork(inputLayer, hiddenLayers, outputLayer);

        // Definition der Gewichte der Kanten zwischen InputLayer und HiddenLayer
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

        // Definition der Gewichte der Kanten zwischen HiddenLayer und OutputLayer
        double[][] weightsArrayHiddenLayerOutputLayer = {
            {-0.87, 0.98},
            {0.63, -0.99}
        };

        // Erstellen der Kanten zwischen den Schichten
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

        // Erstellen der InputData-Objekte für die Zahlen 0 und 1
        InputData inputData0 = new InputData(inputArrayZahl0);
        InputData inputData1 = new InputData(inputArrayZahl1);

        // Berechnen der Resultate für die obigen Inputs
        // TODO: Setze inputData0 oder InputData1 ein, um die entsprechenden Resultate zu erhalten
        neuralNetwork.startCalculation(inputData0);


    }


}
