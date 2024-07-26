public class InputData {

    double[][] data;
    int size;

    public InputData(double[][] data) {
        this.data = data;
        size = data.length * data[0].length;
    }

    public double getValueWithXandY(int x, int y){
        return data[x][y];
    }

    public double getValueWithIndex(int index){
        int numberOfRows = data.length;
        int numberOfColumns = data[0].length;

        int row = index/numberOfRows;
        int column = index%numberOfRows;

        return data[row][column];
    }

    public int getSize() {
        return size;
    }
}
