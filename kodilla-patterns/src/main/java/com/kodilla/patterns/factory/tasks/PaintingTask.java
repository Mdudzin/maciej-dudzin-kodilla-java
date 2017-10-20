package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        taskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}