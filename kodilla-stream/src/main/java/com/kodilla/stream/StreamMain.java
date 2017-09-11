package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        System.out.println("Rozpoczynamy upiększanie!");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("Hello world!", simpleText -> simpleText.toLowerCase()));
        System.out.println(poemBeautifier.beautify("Hello world!", simpleText -> simpleText.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Hello world!", simpleText -> "ABC " + simpleText + " ABC"));
        System.out.println(poemBeautifier.beautify("Hello world!", simpleText -> "*******" + simpleText + "*******"));
    }
}