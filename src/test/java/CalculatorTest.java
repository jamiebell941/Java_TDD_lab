import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAddNum(){
        assertEquals(6, calculator.addNum(4, 2));
    }

    @Test
    public void canSubNum(){
        assertEquals(4, calculator.subNum(8, 4));
    }

    @Test
    public void canDivNum(){
        assertEquals(10.00, calculator.divideNum(1.00, 0.1), 0.01 );
    }

    @Test
    public void canMultiNum(){
        assertEquals(10, calculator.multiNum(2, 5));
    }
}
