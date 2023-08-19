package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Reminder {
    UUID uuid ;
    private String task;
    private Date date;
    private boolean completed;

    public Reminder(UUID uuid,String task, Date date, boolean completed) {
        this.uuid = UUID.randomUUID();
        this.task = task;
        this.date = date;
        this.completed = completed;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "task='" + task + '\'' +
                ", date=" + date +
                ", completed=" + completed +
                '}';
    }
}
