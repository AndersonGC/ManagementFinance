package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movement {

    private String name;
    private Classification classification;
    private Double value;
    private Date entryDay;
    private Date registrationDay;
    private boolean transactionType;
    private long id;

    public Movement(String name, Classification classification, Double value, Date entryDay, Date registrationDay, boolean transactionType) {
        this.name = name;
        this.classification = classification;
        this.value = value;
        this.entryDay = entryDay;
        this.registrationDay = registrationDay;
        this.transactionType = transactionType;
    }
    
    public Movement(String name, Classification classification, Double value, Date entryDay, Date registrationDay, boolean transactionType, Long id) {
        this.name = name;
        this.classification = classification;
        this.value = value;
        this.entryDay = entryDay;
        this.registrationDay = registrationDay;
        this.transactionType = transactionType;
        this.id = id;
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

    public Date getEntryDay() {
        return entryDay;
    }

    public void setEntryDay(Date entryDay) {
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

    public boolean getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(boolean transactionType) {
        this.transactionType = transactionType;
    }
    
    public String getFormatEntryDay(){
        return new SimpleDateFormat("dd/MM/yyyy").format(entryDay);
    }
    
    public String getFormatRegistrationDay(){
        return new SimpleDateFormat("dd/MM/yyyy").format(registrationDay);
    }
  
    @Override
    public String toString() {
        return "Movement{" + "name=" + name + ", classification=" + classification + ", value=" + value + ", entryDay=" + getFormatEntryDay() + ", registrationDay=" + getFormatRegistrationDay() + ", transactionType=" + transactionType + ", ID=" + id + '}';
    }

}
