package com.example.alamin.createviewroutine.activity.models;

public class RoutineModel {
    private StringBuilder dayName= new StringBuilder();
    private StringBuilder time= new StringBuilder();
    private StringBuilder task= new StringBuilder();
    private String[] tasks, times, days;

    public RoutineModel(StringBuilder dayName, StringBuilder time, StringBuilder task) { //constructor with parameters
        this.dayName = dayName;
        this.time = time;
        this.task = task;
    }
    public RoutineModel(){ //empty constructor

    }
    public StringBuilder getDayName() {
        return dayName;
    }

    public void setDayName(StringBuilder dayName) {
        this.dayName = dayName;
    }

    public StringBuilder getTime() {
        return time;
    }

    public void setTime(StringBuilder time) {
        this.time = time;
    }

    public StringBuilder getTask() {
        return task;
    }

    public void setTask(StringBuilder task) {
        this.task = task;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    public String[] getTimes() {
        return times;
    }

    public void setTimes(String[] times) {
        this.times = times;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }
}
