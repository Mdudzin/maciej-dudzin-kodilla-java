package com.kodilla.stream.beautifier;

import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain2 {

    public static void main(String[] args) {

        System.out.println("Rozpoczynamy upiększanie!");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("Hello world!", String::toLowerCase));
        System.out.println(poemBeautifier.beautify("Hello world!", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("Hello world!", simpleText -> "ABC " + simpleText + " ABC"));
        System.out.println(poemBeautifier.beautify("Hello world!", simpleText -> "*******" + simpleText + "*******"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}