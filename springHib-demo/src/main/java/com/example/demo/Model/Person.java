package com.example.demo.Model;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("person")
public class Person {
    String fistName;
    String secondName;
    Date bornDate;
    String pesel;

    public Person() {
    }

    public String getFistName() {
        return fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public String getPesel() {
        return pesel;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Person(String fistName, String secondName, Date bornDate, String pesel) {
        this.fistName = fistName;
        this.secondName = secondName;
        this.bornDate = bornDate;
        this.pesel = pesel;

    }
}
