import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<MyCallable> list = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            MyCallable mc = new MyCallable("Поток " + i);
            list.add(mc);
        }

        List<Future<Integer>> futures = es.invokeAll(list);
        System.out.println(es.invokeAny(list));

        es.shutdown();
    }
}
