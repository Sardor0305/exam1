package service;

import model.Reminder;

//todo - Create a program that simulates a simple reminder application.
// The program should allow users to schedule reminders for specific tasks
// at designated times
// Requirements:
//    Create a Reminder class that represents a single reminder. It should have the following properties: task (String), time (Date), and completed (boolean).
//    Implement a ReminderScheduler class that manages the scheduling and execution of reminders using a ScheduledThreadPoolExecutor.
//    The ReminderScheduler class should have the following methods:
//        scheduleReminder(Reminder reminder): Schedules a reminder for execution at the specified time.
//        cancelReminder(Reminder reminder): Cancels a scheduled reminder.
//        markReminderAsCompleted(Reminder reminder): Marks a reminder as completed.
//        Schedule a new reminder by providing the task description and the time (in the format "yyyy-MM-dd HH:mm:ss").
//        Cancel a scheduled reminder by specifying the task description.
//        Mark a reminder as completed by specifying the task description.
public interface ExecutorServices {

    void scheduleReminder(Reminder reminder);
    void  cancelReminder(Reminder reminder);
    void markReminderAsCompleted(Reminder reminder);


}
