package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book kolobok = new Book("Колобок ", 20);
        Book redHood = new Book("Красная шапочка ", 50);
        Book cleanCode = new Book("Clean code ", 70);
        Book snowQueen = new Book("Снежная королева ", 120);
        Book[] books = new Book[4];
        books[0] = kolobok;
        books[1] = redHood;
        books[2] = cleanCode;
        books[3] = snowQueen;
        for (Book elements : books) {
            System.out.println(elements.getNameBook() + elements.getCountOfPage());
        }
        System.out.println("-----------");
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        for (Book elements : books) {
            System.out.println(elements.getNameBook() + elements.getCountOfPage());
        }
        System.out.println("-----------");
        for (Book elements : books) {
            if ("Clean code ".equals(elements.getNameBook())) {
                System.out.println(elements.getNameBook() + elements.getCountOfPage());
            }
        }
    }
}
