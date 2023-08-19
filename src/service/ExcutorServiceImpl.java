package service;

import model.Reminder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ExcutorServiceImpl implements ExecutorServices{
ScheduledExecutorService executors = Executors.newScheduledThreadPool(1);

    @Override
    public void scheduleReminder(Reminder reminder) {
        LocalDateTime dateTime = LocalDateTime.now();
        long seconds = dateTime.toInstant(ZoneOffset.UTC).getEpochSecond();
        long seconds1 = reminder.getDate().toInstant(ZoneOffset.UTC).getEpochSecond();
        executors.scheduleAtFixedRate((()->{
            if(!reminder.isCompleted()){
                System.out.println(reminder.getTask());
            }
        }),0,seconds1-seconds, SECONDS);
    }

    @Override
    public void cancelReminder(Reminder reminder) {

    }

    @Override
    public void markReminderAsCompleted(Reminder reminder) {

    }



}
