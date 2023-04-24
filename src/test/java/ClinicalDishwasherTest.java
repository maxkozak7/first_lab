
import ua.lviv.iot.algo.part1.lab1.ClinicalDishwasher;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClinicalDishwasherTest {
    @Test
    void testGetPowerConsumptionPerCycle() {
        ClinicalDishwasher dishwasher = new ClinicalDishwasher("", 100.0, 10, 2.0, 30);
        assertEquals(2.5, dishwasher.getPowerConsumptionPerCycle());
    }

    @Test
    void testConstructor() {
        ClinicalDishwasher dishwasher = new ClinicalDishwasher("model", 100.0, 10, 2.0, 30);
        assertEquals("model", dishwasher.getModel());
        assertEquals(100.0, dishwasher.getMaxTemperature());
        assertEquals(10, dishwasher.getVolumeInLiters());
        assertEquals(2.0, dishwasher.getPowerInKw());
        assertEquals(30, dishwasher.getSterilizationCycleDurationInMinutes());
    }

}


