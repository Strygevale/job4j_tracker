package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int quantityProgrammer;

    public Programmer(String name, String surname, String education, String birthday, int quantityProgrammer) {
        super(name, surname, education, birthday);
        this.quantityProgrammer = quantityProgrammer;
    }

    public void showInfo() {
        System.out.println("Количество программистов: " + quantityProgrammer);
    }

    public void work() {
        System.out.println("Пишет код");
    }
}
