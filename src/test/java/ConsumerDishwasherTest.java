import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.ConsumerDishwasher;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsumerDishwasherTest {

    @Test
    public void testGetPowerConsumptionPerCycle() {
        ConsumerDishwasher dishwasher = new ConsumerDishwasher("model", 10);
        double expectedPowerConsumptionPerCycle = 1.2;
        double actualPowerConsumptionPerCycle = dishwasher.getPowerConsumptionPerCycle();
        assertEquals(expectedPowerConsumptionPerCycle, actualPowerConsumptionPerCycle, 0.001);
    }
    @Test
    public void testConstructor() {
        ConsumerDishwasher dishwasher = new ConsumerDishwasher("model", 10);
        assertEquals("model", dishwasher.getModel());
        assertEquals(10, dishwasher.getMaxCapacity());
    }

}


