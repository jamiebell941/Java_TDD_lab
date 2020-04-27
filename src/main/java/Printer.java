public class Printer {

    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets() {
        return sheets;
    }

    public void printCopies(int sheets, int copies) {
        int printings = sheets * copies;
        if (sheets >= printings){
        sheets -= printings;
        }

    }
}
