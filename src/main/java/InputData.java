public class InputData {

    double[][] data;
    int size;

    public InputData(double[][] data) {
        this.data = data;
        size = data.length * data[0].length;
    }

    // TODO: Aufgabe 5) Implementiere die Methode so, dass über einen Index auf das Array zugegriffen wird
    public double getValueByIndex(int index){
        int numberOfColumns = data[0].length;

        int row = index/numberOfColumns;
        int column = index%numberOfColumns;

        return data[row][column];
    }

    public int getSize() {
        return size;
    }
}
