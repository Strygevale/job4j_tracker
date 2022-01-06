package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int quantityProgrammer;

    public Programmer(int quantityProgrammer) {
        this.quantityProgrammer = quantityProgrammer;
    }

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void showInfo() {
        System.out.println("Количество программистов: " + quantityProgrammer);
    }

    public void work() {
        System.out.println("Пишет код");
    }
}
