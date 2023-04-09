import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.IndustrialDishwasher;
import static org.junit.Assert.assertEquals;

public class IndustrialDishwasherTest {
    @Test
    public void testGetPowerConsumptionPerCycle() {
        IndustrialDishwasher dishwasher = new IndustrialDishwasher("Model X", 50);
        assertEquals(0.5, dishwasher.getPowerConsumptionPerCycle(), 0.0001);
    }

    @Test
    public void testModelGetterAndSetter() {
        IndustrialDishwasher dishwasher = new IndustrialDishwasher("Model X", 50);
        dishwasher.setModel("Model Y");
        assertEquals("Model Y", dishwasher.getModel());
    }

    @Test
    public void testMaxCapacityGetterAndSetter() {
        IndustrialDishwasher dishwasher = new IndustrialDishwasher("Model X", 50);
        dishwasher.setMaxCapacity(100);
        assertEquals(100, dishwasher.getMaxCapacity());
    }
}
