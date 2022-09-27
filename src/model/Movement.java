package model;

import java.util.Date;

public class Movement {

    private String name;
    private Classification classification;
    private Double value;
    private String entryDay;
    private Date registrationDay;

    private long id;

    public Movement(String name, Classification classification, Double value, String entryDay, Date registrationDay) {
        this.name = name;
        this.classification = classification;
        this.value = value;
        this.entryDay = entryDay;
        this.registrationDay = registrationDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getEntryDay() {
        return entryDay;
    }

    public void setEntryDay(String entryDay) {
        this.entryDay = entryDay;
    }

    public Date getRegistrationDay() {
        return registrationDay;
    }

    public void setRegistrationDay(Date registrationDay) {
        this.registrationDay = registrationDay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movement{" + "name=" + name + ", classification=" + classification + ", value=" + value + ", entryDay=" + entryDay + ", registrationDay=" + registrationDay + ", id=" + id + '}';
    }

}
