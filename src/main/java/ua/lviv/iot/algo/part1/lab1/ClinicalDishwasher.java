package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class ClinicalDishwasher extends Dishwasher {
    private static final double POWER_CONSUMPTION_PER_CYCLE = 2.5;
    private double maxTemperature;
    private int volumeInLiters;
    private double powerInKw;
    private int sterilizationCycleDurationInMinutes;

    public ClinicalDishwasher(String model, double maxTemperature, int volumeInLiters, double powerInKw, int sterilizationCycleDurationInMinutes) {
        super(model, 20); // capacity is not needed for clinical dishwasher
        this.maxTemperature = maxTemperature;
        this.volumeInLiters = volumeInLiters;
        this.powerInKw = powerInKw;
        this.sterilizationCycleDurationInMinutes = sterilizationCycleDurationInMinutes;
    }

    public double getPowerConsumptionPerCycle() {
        return POWER_CONSUMPTION_PER_CYCLE;
    }
}
