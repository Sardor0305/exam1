import model.Reminder;
import service.ExcutorServiceImpl;
import service.ExecutorServices;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

// todo - please do not forget creating git repository
//  for this exam and make it public, and also share the link
//  of the project in the group.
public class Main {
    public static void main(String[] args) {
//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
        Streams streams = new Streams();
        RaceConditionProblem rece = new RaceConditionProblem();
        String s = "/home/sharipov/IdeaProjects/examticket/resources/notes/text.txt";
        String l = "/home/sharipov/IdeaProjects/examticket/resources/notes/text1.txt";
        streams.copyFile(s,l);
       //problem
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
  rece.add();
            }
        }
    });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000 ; i++) {
                    rece.add();
                }
            }
        });

        thread1.start();
        thread2.start();

        //solution;
        UUID uuid = UUID.randomUUID();
        Reminder reminder = new Reminder(uuid,"hi", LocalDateTime.parse("2023-08-19 13:31:12"),false);

        ExecutorServices executorServices = new ExcutorServiceImpl();
        executorServices.scheduleReminder(reminder);




}
    }