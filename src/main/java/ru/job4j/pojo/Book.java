package ru.job4j.pojo;

public class Book {

    private String nameBook;
    private int countOfPage;

    public Book(String nameBook, int countOfPage) {
        this.nameBook = nameBook;
        this.countOfPage = countOfPage;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }
}
