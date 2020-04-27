import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getCurrentVolume(){
        assertEquals(100, waterBottle.currentVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.drink(10));
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterBottle.empty(waterBottle.currentVolume()));
    }

    @Test
    public void canFill(){
        assertEquals(100, waterBottle.fill(waterBottle.currentVolume()));
    }
}
