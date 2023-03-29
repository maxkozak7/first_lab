package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Dishwasher {
    private String model;
    private static final int MAX_CAPACITY = 15;
    private int maxCapacity = MAX_CAPACITY;;
    private int currentCapacity;
    private boolean isOn;

    private static Dishwasher instance;

    public static Dishwasher getInstance() {
        if (instance == null) {
            instance = new Dishwasher("Concept", MAX_CAPACITY);
        }
        return instance;
    }

    public Dishwasher(String model, int maxCapacity) {
        this.model = model;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Dishwasher is now on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Dishwasher is now off.");
    }

    public void loadDishes(int count) {
        int freeCapacity = this.maxCapacity - this.currentCapacity;
        int loadedCount = 0;
        for (int i = 0; i < count && freeCapacity > 0; i++) {
            this.currentCapacity++;
            loadedCount++;
            freeCapacity--;
        }
        if (loadedCount > 0) {
            System.out.println(loadedCount + " dishes have been added to the dishwasher.");
        }
        if (loadedCount < count) {
            System.out.println("There is not enough space in the dishwasher for " + (count - loadedCount) + " dishes.");
        }
    }

    public void cleanDishes() {
        if (this.currentCapacity > 0) {
            System.out.println(this.currentCapacity + " dishes have been cleaned.");
            this.currentCapacity = 0;
        } else {
            System.out.println("The dishwasher is already empty.");
        }
    }


    public static void main(String[] args) {
        Dishwasher dishwasher1 = new Dishwasher();
        Dishwasher dishwasher2 = new Dishwasher("Bosch", 10);
        Dishwasher dishwasher3 = Dishwasher.getInstance();
        Dishwasher dishwasher4 = Dishwasher.getInstance();

        Dishwasher[] dishwashers = { dishwasher1, dishwasher2, dishwasher3, dishwasher4 };

        for (Dishwasher dishwasher : dishwashers) {
            System.out.println(dishwasher.toString() + " - " + dishwasher.hashCode());
        }
    }
}