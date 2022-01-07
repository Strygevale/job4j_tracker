package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int quantitySurgeon;

    public Surgeon(String name, String surname, String education, String birthday, int quantitySurgeon) {
        super(name, surname, education, birthday);
        this.quantitySurgeon = quantitySurgeon;
    }

    public void showInfo() {
        System.out.println("Количество хирургов: " + quantitySurgeon);
    }

    public void work() {
        System.out.println("Проводит операцию");
    }
}
