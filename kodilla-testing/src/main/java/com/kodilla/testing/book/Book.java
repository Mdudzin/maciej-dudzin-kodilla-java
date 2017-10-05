package com.kodilla.testing.book;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!author.equals(book.author)) return false;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return author.hashCode();
    }

    public static void main (String[] args){

        Book book = new Book("Autor", "Tytuł");

        List<Book> list = new LinkedList<>();
        for(int n = 0; n < 5000000; n++) {
            list.add(book);
        }

        long begin = System.currentTimeMillis();
        list.remove(list.size()-1);
        long end = System.currentTimeMillis();
        System.out.println("Usunięcie ostatniego elementu listy zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        list.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Usunięcie pierwszego elementu listy zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        list.add(book);
        end = System.currentTimeMillis();
        System.out.println("Dodanie elementu listy na końcu kolekcji zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        list.add(0,book);
        end = System.currentTimeMillis();
        System.out.println("Dodanie elementu listy na początku kolekcji zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        list.get(0);
        end = System.currentTimeMillis();
        System.out.println("Wyszukanie pierwszego elementu listy zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        list.get(list.size()-1);
        end = System.currentTimeMillis();
        System.out.println("Wyszukanie ostatniego elementu listy zajęło: " + (end - begin) + "ms");

        Map<Book, Boolean> mapa = new HashMap<>();
        for(int n = 0; n < 2000000; n++) {
            mapa.put(new Book("Autor" + n, "Tytuł"), true);
        }

        begin = System.currentTimeMillis();
        mapa.remove(new Book("Autor0", "Tytuł"));
        end = System.currentTimeMillis();
        System.out.println("Usunięcie ostatniego elementu mapy zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        mapa.remove(new Book("Autor1999999", "Tytuł"));
        end = System.currentTimeMillis();
        System.out.println("Usunięcie pierwszego elementu mapy zajęło: " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        mapa.get(new Book("Autor1999999", "Tytuł"));
        end = System.currentTimeMillis();
        System.out.println("Wyszukanie ostatniego elementu mapy zajęło: " + (end - begin) + "ms");
    }
}