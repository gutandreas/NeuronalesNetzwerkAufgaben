import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputDataTest {

    @Test
    public void testGetValueByIndex(){
        double inputArrayZahl[][] = {
                {0.2, 0.3, 0.4, 0.5},
                {-0.5, 1.0, 0.3, 0.0},
                {0.0, 1.0, 0.9, 0.2}};

        InputData inputData = new InputData(inputArrayZahl);
        Assertions.assertEquals(-0.5, inputData.getValueByIndex(4));
        Assertions.assertEquals(1.0, inputData.getValueByIndex(9));
        Assertions.assertEquals(0.2, inputData.getValueByIndex(11));
    }
}
