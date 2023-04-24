import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.ClinicalDishwasher;
import ua.lviv.iot.algo.part1.lab1.Dishwasher;
import ua.lviv.iot.algo.part1.lab1.DishwasherManager;
import ua.lviv.iot.algo.part1.lab1.IndustrialDishwasher;
import ua.lviv.iot.algo.part1.lab1.PortableDishwasher;
import ua.lviv.iot.algo.part1.lab1.ConsumerDishwasher;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DishwasherManagerTest {
    private DishwasherManager dishwasherManager;

    @BeforeEach
    void setUp() {
        dishwasherManager = new DishwasherManager();
    }

    @Test
    void testAddDishwasher() {
        ConsumerDishwasher consumerDishwasher = new ConsumerDishwasher("Consumer Model", 10);
        dishwasherManager.addDishwasher(consumerDishwasher);
        assertTrue(dishwasherManager.findByModel("Consumer Model").isPresent());
    }

    @Test
    void testFindByModel() {
        ConsumerDishwasher consumerDishwasher = new ConsumerDishwasher("Consumer Model", 10);
        dishwasherManager.addDishwasher(consumerDishwasher);
        Optional<Dishwasher> foundDishwasher = dishwasherManager.findByModel("Consumer Model");
        assertTrue(foundDishwasher.isPresent());
        assertEquals(consumerDishwasher, foundDishwasher.get());
    }

    @Test
    void testFindByModelNotFound() {
        Optional<Dishwasher> foundDishwasher = dishwasherManager.findByModel("Non-existent Model");
        assertFalse(foundDishwasher.isPresent());
    }

    @Test
    void testFindMaxCapacityGreaterThan() {
        ConsumerDishwasher consumerDishwasher1 = new ConsumerDishwasher("Consumer Model 1", 10);
        ConsumerDishwasher consumerDishwasher2 = new ConsumerDishwasher("Consumer Model 2", 20);
        ConsumerDishwasher consumerDishwasher3 = new ConsumerDishwasher("Consumer Model 3", 15);

        dishwasherManager.addDishwasher(consumerDishwasher1);
        dishwasherManager.addDishwasher(consumerDishwasher2);
        dishwasherManager.addDishwasher(consumerDishwasher3);

        List<Dishwasher> dishwashersWithCapacityGreaterThan15 = dishwasherManager.findMaxCapacityGreaterThan(15);

        assertEquals(1, dishwashersWithCapacityGreaterThan15.size());
        assertEquals(consumerDishwasher2, dishwashersWithCapacityGreaterThan15.get(0));
    }

    @Test
    void testFindMaxCapacityGreaterThanNone() {
        ConsumerDishwasher consumerDishwasher1 = new ConsumerDishwasher("Consumer Model 1", 10);
        ConsumerDishwasher consumerDishwasher2 = new ConsumerDishwasher("Consumer Model 2", 20);

        dishwasherManager.addDishwasher(consumerDishwasher1);
        dishwasherManager.addDishwasher(consumerDishwasher2);

        List<Dishwasher> dishwashersWithCapacityGreaterThan25 = dishwasherManager.findMaxCapacityGreaterThan(25);

        assertTrue(dishwashersWithCapacityGreaterThan25.isEmpty());
    }
}

















