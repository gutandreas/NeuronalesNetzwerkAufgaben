public class InputData {

    double[][] data;
    int size;

    public InputData(double[][] data) {
        this.data = data;
        size = data.length * data[0].length;
    }

    // TODO: Aufgabe 5) Implementiere die Methode so, dass über einen Index auf das Array zugegriffen wird
    public double getValueByIndex(int index){


        return 0; // Steht nur da, damit es keinen Fehler anzeigt. Muss bei der Implementierung ersetzt werden...
    }

    public int getSize() {
        return size;
    }
}
