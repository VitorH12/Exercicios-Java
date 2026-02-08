package entities;
import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer duration;

    public HourContract(LocalDate date, double valuePerHour, int duration) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getDuration() {
        return duration;
    }
}
