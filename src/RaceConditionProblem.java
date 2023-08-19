import java.util.concurrent.atomic.AtomicInteger;

//todo - simulate the race condition problem here
// and the solution with commenting previous state.
public class RaceConditionProblem {
    public AtomicInteger a = new AtomicInteger(1);
    public  void add(){
        System.out.println(a.incrementAndGet());
    }




}
