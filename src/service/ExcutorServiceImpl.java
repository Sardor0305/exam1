package service;

import model.Reminder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ExcutorServiceImpl implements ExecutorServices {
    ScheduledExecutorService executors = Executors.newScheduledThreadPool(1);

    @Override
    public void scheduleReminder(Reminder reminder) {
        Date reminderTime = reminder.getDate();
        long initialDelay = reminderTime.getTime() - System.currentTimeMillis();

       executors.schedule(() -> {
            if (!reminder.isCompleted()) {
                System.out.println("Reminder: " + reminder.getTask());
            }
        }, initialDelay, TimeUnit.MILLISECONDS);

        reminderTime = new Date(System.currentTimeMillis() + initialDelay);
        reminder.setDate(reminderTime);

    }





    @Override
    public void cancelReminder(Reminder reminder) {

    }

    @Override
    public void markReminderAsCompleted(Reminder reminder) {

    }


}
