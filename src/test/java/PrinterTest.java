import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void hasSheets(){
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.printCopies(1, 1);
      assertEquals(2, printer.getSheets());
    }

    @Test
    public void cantPrint(){
        printer.printCopies(20, 5);
        assertEquals(20, printer.getSheets());
    }
}
