import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    public static void main(String[] args) {
        int n = 10;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i <n; i++) {
            executor.submit(new Frequent());
        }
    }
}
