package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int quantityEngineer;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void showInfo() {
        System.out.println("Количество инженеров: " + quantityEngineer);
    }

    public void work() {
        System.out.println("Разрабатывает чертеж");
    }
}
