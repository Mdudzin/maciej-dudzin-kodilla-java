package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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