package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFio("Kozlova Masha Vasilevna");
        student1.setGroup("IVT-173");
        student1.setCreated(new Date());

        String ln = System.lineSeparator();
        System.out.println("Студент: " + student1.getFio() + ln + "Группа: " + student1.getGroup() + ln + "Дата поступления: " + student1.getCreated());
    }
}
