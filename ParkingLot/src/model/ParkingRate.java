package model;

import java.util.Objects;

public class ParkingRate {
    private double hourlyRate;
    private double dailyRate;
    private double weeklyRate;

    public ParkingRate(double hourlyRate, double dailyRate, double weeklyRate) {
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
        this.weeklyRate = weeklyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingRate that = (ParkingRate) o;
        return Double.compare(that.hourlyRate, hourlyRate) == 0 &&
                Double.compare(that.dailyRate, dailyRate) == 0 &&
                Double.compare(that.weeklyRate, weeklyRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourlyRate, dailyRate, weeklyRate);
    }

    @Override
    public String toString() {
        return "ParkingRate{" +
                "hourlyRate=" + hourlyRate +
                ", dailyRate=" + dailyRate +
                ", weeklyRate=" + weeklyRate +
                '}';
    }
}

