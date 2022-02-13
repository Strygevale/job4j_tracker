package ru.job4j.bank;

import java.util.Objects;

public class Account {
    /**
     * Класс описывает счет в банке клиентов
     * @author Andrey Shmider
     * @version 1.0
     */
    /**
     * В переменной requisite хранится номер счета
     */
    private String requisite;
    /**
     * Переменная balance описывает баланс счета
     */
    private double balance;

    /**
     * Конструктор класса Account
     * @param requisite реквизиты тсчета
     * @param balance количество денежных средств
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод получения реквезитов
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод установления значения реквезитов
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод получения баланса
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод установления баланса
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнение объекта по полю requisite
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}