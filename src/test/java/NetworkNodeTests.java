import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkNodeTests {

    @Test
    public void testCalculateOutput() {
        NetworkNode networkNodeFrom1 = new NetworkNode();
        networkNodeFrom1.setOutput(0.2);
        NetworkNode networkNodeFrom2 = new NetworkNode();
        networkNodeFrom2.setOutput(-0.5);

        double weightSum = 0.2 * 0.9 + -0.5 * 0.5;
        double result = 1 / (1 + Math.exp(-weightSum));

        NetworkNode networkNodeTo = new NetworkNode();
        NetworkEdge networkEdge1 = new NetworkEdge(networkNodeFrom1, networkNodeTo, 0.9);
        networkNodeTo.addInputEdge(networkEdge1);
        NetworkEdge networkEdge2 = new NetworkEdge(networkNodeFrom2, networkNodeTo, 0.5);
        networkNodeTo.addInputEdge(networkEdge2);
        networkNodeTo.calculateOutput();

        assertEquals(result, networkNodeTo.getOutput());
    }
}
