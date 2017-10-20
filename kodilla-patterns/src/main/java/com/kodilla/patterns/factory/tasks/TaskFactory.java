package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "Driving Task";
    public static final String PAINTING_TASK = "Painting Task";
    public static final String SHOPPING_TASK = "Shopping Task";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {

            case DRIVING_TASK:
                return new DrivingTask("The Driving Task", "Gdańsk", "Car");
            case PAINTING_TASK:
                return new PaintingTask("The Painting Task", "White", "Desk");
            case SHOPPING_TASK:
                return new ShoppingTask("The Shopping Task", "Bread", 5);
            default:
                return null;
        }
    }
}