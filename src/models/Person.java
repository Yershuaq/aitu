package models;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this("Name", "Surname");
    }

    public Person(String name, String surname) {
        this.id = idCounter++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return String.format("%d. %s %s", getId(), getName(), getSurname());
    }

    public String getFormattedData() {
        return String.format("%s earns %.2f tenge.", toString(), getPaymentAmount());
    }
}

