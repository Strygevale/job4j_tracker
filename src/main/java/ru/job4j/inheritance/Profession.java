package ru.job4j.inheritance;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession() {
    }

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
}
