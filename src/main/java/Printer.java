public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public void printCopies(int sheets, int copies) {
        int printings = sheets * copies;
        if (sheets >= printings) {
            sheets -= printings;}
    }

    public void print(int pages, int copies) {
        int printings = pages * copies;
        if ((printings <= sheets) & (printings <= toner)){
            sheets -= printings;
            toner -= printings;
        }}

    public int getToner() {
        return toner;
    }
}

