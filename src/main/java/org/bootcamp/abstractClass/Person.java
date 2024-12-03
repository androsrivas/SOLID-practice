package org.bootcamp.abstractClass;

public abstract class Person {
    private String name;
    private String surname;
    private String birthday;
    private String ID;

    public Person (String name, String surname, String birthday, String ID) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getID() { return ID; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setID(String ID) { this.ID = ID; }

    public abstract void displayInfo();
}
