package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given//
        Library library = new Library("Biblioteka");

        Book book1 = new Book("Ksiazka1", "Autor1", LocalDate.of(1985,1,10));
        Book book2 = new Book("Ksiazka2", "Autor2", LocalDate.of(1985,1,10));
        Book book3 = new Book("Ksiazka3", "Autor3", LocalDate.of(1985,1,10));
        Book book4 = new Book("Ksiazka4", "Autor4", LocalDate.of(1985,1,10));
        Book book5 = new Book("Ksiazka5", "Autor5", LocalDate.of(1985,1,10));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);

        //When//

        //making a shallow copy//
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy//
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book5);

        //Then//
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}