package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class PortableDishwasher extends Dishwasher {
    private static final double POWER_CONSUMPTION_PER_CYCLE =0.5;
    private String model;
    private int maxCapacity;

    public PortableDishwasher(String model, int maxCapacity) {
        this.model = model;
        this.maxCapacity = maxCapacity;
    }
    public double getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }
}

