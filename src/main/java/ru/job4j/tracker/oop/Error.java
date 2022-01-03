package ru.job4j.tracker.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        this.active = true;
        this.status = 1;
        this.message = "Hello";
    }

    public void showInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 1, "NullPointerException");
        Error error2 = new Error(true, 1, "ArrayExeption");
        Error error3 = new Error(false, 0, "Ok");
        Error error4 = new Error();
        error1.showInfo();
        error2.showInfo();
        error3.showInfo();
        error4.showInfo();
    }
}
