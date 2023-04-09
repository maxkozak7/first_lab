import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.PortableDishwasher;
import static org.junit.jupiter.api.Assertions.*;

class PortableDishwasherTest {

    @Test
    void testGetModel() {
        PortableDishwasher dishwasher = new PortableDishwasher("Model X", 10);
        assertEquals("Model X", dishwasher.getModel());
    }

    @Test
    void testGetMaxCapacity() {
        PortableDishwasher dishwasher = new PortableDishwasher("Model X", 10);
        assertEquals(10, dishwasher.getMaxCapacity());
    }

    @Test
    void testGetPowerConsumptionPerCycle() {
        PortableDishwasher dishwasher = new PortableDishwasher("Model X", 10);
        assertEquals(0.5, dishwasher.getPowerConsumptionPerCycle(), 0.001);
    }

    @Test
    void testSetModel() {
        PortableDishwasher dishwasher = new PortableDishwasher("Model X", 10);
        dishwasher.setModel("Model Y");
        assertEquals("Model Y", dishwasher.getModel());
    }

    @Test
    void testSetMaxCapacity() {
        PortableDishwasher dishwasher = new PortableDishwasher("Model X", 10);
        dishwasher.setMaxCapacity(15);
        assertEquals(15, dishwasher.getMaxCapacity());
    }
}
