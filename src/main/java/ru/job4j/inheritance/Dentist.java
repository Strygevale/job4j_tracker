package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int quantityDentist;

    public Dentist(String name, String surname, String education, String birthday, int quantityDentist) {
        super(name, surname, education, birthday);
        this.quantityDentist = quantityDentist;
    }

    public void showInfo() {
        System.out.println("Количество дантистов: " + quantityDentist);
    }

    public void work() {
        System.out.println("Лечит зубы");
    }
}
