package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель данных User, содержащая информацию о пользователе банка
 */
public class User {
    /**
     * Переменная passport хранит паспорт пользоватея
     */
    private String passport;

    /**
     * Переменная username хранит имя пользоватея
     */
    private String username;

    /**
     * Конструктор класс User
     * @param passport сохранение данных о паспорте нового пользователя
     * @param username сохранение данных об имени нового пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод получения паспорта пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод устанавливает данные о паспорте пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод получения имени пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод установалния имени пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнение объектов типа User происходит по значению поля passport
     * @param o сравниваемый объект
     * @return возвращает true при равенстве объектов и false при неравенстве
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}