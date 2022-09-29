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
    private int transactionType;
    private long id;

    public Movement(String name, Classification classification, Double value, String entryDay, Date registrationDay, int transactionType) {
        this.name = name;
        this.classification = classification;
        this.value = value;
        try {
            this.entryDay = new SimpleDateFormat("dd/MM/yyyy").parse(entryDay);
        } catch (ParseException ex) {
            Logger.getLogger(Movement.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.registrationDay = registrationDay;
        this.transactionType = transactionType;
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

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
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
