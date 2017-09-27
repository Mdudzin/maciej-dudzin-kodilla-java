package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3, 2);

        } catch (Exception e) {

            System.err.println("Generic error! " + e);
        }

    }
}