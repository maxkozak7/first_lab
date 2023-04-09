import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.Dishwasher;
import ua.lviv.iot.algo.part1.lab1.ConsumerDishwasher;





import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DishwasherTest {
    private Dishwasher dishwasher;

    @BeforeEach
    void setUp() {
        dishwasher = new ConsumerDishwasher("model", 5);
    }

    @Test
    void testTurnOn() {
        assertFalse(dishwasher.isOn());
        dishwasher.turnOn();
        assertTrue(dishwasher.isOn());
    }

    @Test
    void testTurnOff() {
        assertFalse(dishwasher.isOn());
        dishwasher.turnOff();
        assertFalse(dishwasher.isOn());
    }

    @Test
    void testLoadDishes() {
        assertEquals(0, dishwasher.getCurrentCapacity());
        dishwasher.loadDishes(3);
        assertEquals(3, dishwasher.getCurrentCapacity());
        dishwasher.loadDishes(3);
        assertEquals(5, dishwasher.getCurrentCapacity());
    }

    @Test
    void testLoadDishesFullCapacity() {
        assertEquals(0, dishwasher.getCurrentCapacity());
        dishwasher.loadDishes(10);
        assertEquals(5, dishwasher.getCurrentCapacity());
    }

    @Test
    void testLoadDishesNotEnoughSpace() {
        assertEquals(0, dishwasher.getCurrentCapacity());
        dishwasher.loadDishes(7);
        assertEquals(5, dishwasher.getCurrentCapacity());
    }

    @Test
    void testCleanDishes() {
        dishwasher.loadDishes(5);
        assertTrue(dishwasher.getCurrentCapacity() > 0);
        dishwasher.cleanDishes();
        assertEquals(0, dishwasher.getCurrentCapacity());
    }

    @Test
    void testCleanDishesEmpty() {
        assertEquals(0, dishwasher.getCurrentCapacity());
        dishwasher.cleanDishes();
        assertEquals(0, dishwasher.getCurrentCapacity());
    }

    @Test
    void testGetPowerConsumptionPerCycle() {
        assertEquals(1.2, dishwasher.getPowerConsumptionPerCycle());
    }
}

