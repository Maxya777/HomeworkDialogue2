
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private final String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        while (result < 3) {
            Thread.sleep(2500);
            System.out.println("Я " + this.name + " Всем привет!");
            result++;
        }
        return result;
    }
}