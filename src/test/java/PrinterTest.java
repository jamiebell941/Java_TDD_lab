import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 100);

    }

    @Test
    public void hasSheets(){
        assertEquals(20, printer.getSheets());
    }

//    @Test
//    public void canPrint(){
//        printer.printCopies(1, 1);
//      assertEquals(2, printer.getSheets());
//    }
//
//    @Test
//    public void cantPrint(){
//        printer.printCopies(20, 5);
//        assertEquals(20, printer.getSheets());
//    }

    @Test
    public void willPrint(){
        printer.print(8,2);
        assertEquals(4, printer.getSheets());
    }

    @Test
    public void wontPrint(){
        printer.print(7, 3);
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void enoughToner(){
        printer.print(10, 2);
        assertEquals(80, printer.getToner());
    }

    @Test
    public void notEnoughToner(){
        printer.print(10, 11);
        assertEquals(100, printer.getToner());
    }
}
