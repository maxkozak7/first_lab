package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DishwasherManager {
    private List<Dishwasher> dishwashers;

    public DishwasherManager() {
        dishwashers = new ArrayList<>();
    }

    public void addDishwasher(final Dishwasher dishwasher) {
        dishwashers.add(dishwasher);
    }

    public Optional<Dishwasher> findByModel(final String model) {
        return dishwashers.stream()
                .filter(dishwasher -> dishwasher.getModel().equals(model))
                .findFirst();
    }

    public List<Dishwasher> findMaxCapacityGreaterThan(final int capacity) {
        return dishwashers.stream()
                .filter(dishwasher -> dishwasher.getMaxCapacity() > capacity)
                .sorted(Comparator.comparingInt(Dishwasher::getMaxCapacity))
                .toList();
    }

    public static void main(String[] args) {
        DishwasherManager dishwasherManager = new DishwasherManager();

        ConsumerDishwasher consumerDishwasher1 = new ConsumerDishwasher("Consumer Model 1", 10);
        ConsumerDishwasher consumerDishwasher2 = new ConsumerDishwasher("Consumer Model 2", 20);
        ClinicalDishwasher clinicalDishwasher1 = new ClinicalDishwasher("Clinical Model 1", 100, 50, 5.0, 30);
        ClinicalDishwasher clinicalDishwasher2 = new ClinicalDishwasher("Clinical Model 2", 150, 75, 4.5, 40);
        IndustrialDishwasher industrialDishwasher1 = new IndustrialDishwasher("Industrial Model 1", 500);
        IndustrialDishwasher industrialDishwasher2 = new IndustrialDishwasher("Industrial Model 2", 750);
        PortableDishwasher portableDishwasher1 = new PortableDishwasher("Portable Model 1", 5);
        PortableDishwasher portableDishwasher2 = new PortableDishwasher("Portable Model 2", 8);

        dishwasherManager.addDishwasher(consumerDishwasher1);
        dishwasherManager.addDishwasher(consumerDishwasher2);
        dishwasherManager.addDishwasher(clinicalDishwasher1);
        dishwasherManager.addDishwasher(clinicalDishwasher2);
        dishwasherManager.addDishwasher(industrialDishwasher1);
        dishwasherManager.addDishwasher(industrialDishwasher2);
        dishwasherManager.addDishwasher(portableDishwasher1);
        dishwasherManager.addDishwasher(portableDishwasher2);

        // Output all the created objects in the list
        System.out.println("All the created objects in the list:");
        for (Dishwasher dishwasher : dishwasherManager.dishwashers) {
            System.out.println(dishwasher.toString());
        }

        // search for a dishwasher by model
        Optional<Dishwasher> foundDishwasher = dishwasherManager.findByModel("Clinical Model 1");
        foundDishwasher.ifPresentOrElse(
                dishwasher -> System.out.println("Found dishwasher: " + dishwasher.toString()),
                () -> System.out.println("Dishwasher not found"));

        // search for dishwashers with capacity greater than 15
        List<Dishwasher> dishwashersWithCapacityGreaterThan15 = dishwasherManager.findMaxCapacityGreaterThan(15);
        System.out.println("Dishwashers with capacity greater than 15:");
        dishwashersWithCapacityGreaterThan15.forEach(dishwasher -> System.out.println(dishwasher.toString()));
    }
}