package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String simpleText, PoemDecorator poemDecorator){

        return poemDecorator.decorate(simpleText);
    }
}