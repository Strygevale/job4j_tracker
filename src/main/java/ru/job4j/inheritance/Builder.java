package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int quantityBuilder;

    public Builder(int quantityBuilder) {
        this.quantityBuilder = quantityBuilder;
    }

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void showInfo() {
        System.out.println("Количество строителей: " + quantityBuilder);
    }

    public void work() {
        System.out.println("Разрабатывает чертеж");
    }
}
