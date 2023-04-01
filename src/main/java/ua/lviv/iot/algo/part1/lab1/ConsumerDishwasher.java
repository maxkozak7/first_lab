package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class ConsumerDishwasher extends Dishwasher {
    private static final double POWER_CONSUMPTION_PER_CYCLE = 1.2;

    public ConsumerDishwasher(String model, int maxCapacity) {
        super(model, maxCapacity);
    }

    public double getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }
}
