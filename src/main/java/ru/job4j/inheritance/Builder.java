package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int quantityBuilder;

    public Builder(String name, String surname, String education, String birthday, int quantityBuilder) {
        super(name, surname, education, birthday);
        this.quantityBuilder = quantityBuilder;
    }

    public void showInfo() {
        System.out.println("Количество строителей: " + quantityBuilder);
    }

    public void work() {
        System.out.println("Разрабатывает чертеж");
    }
}
