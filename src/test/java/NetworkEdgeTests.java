
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkEdgeTests {
    @Test
    public void testConstructor() {
        NetworkNode networkNodeFrom = new NetworkNode();
        NetworkNode networkNodeTo = new NetworkNode();
        NetworkEdge networkEdge = new NetworkEdge(networkNodeFrom, networkNodeTo, 0.799);

        assertEquals(networkNodeFrom, networkEdge.getFrom());
        assertEquals(0.799, networkEdge.getWeight());
    }
}
