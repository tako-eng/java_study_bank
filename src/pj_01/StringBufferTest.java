package pj_01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringBufferTest {

    public static void main (String... args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        StringBuffer sb = new StringBuffer();
        List<BufferTask> taskList = new ArrayList<BufferTask>();

        for(int i = 0; i < 100; i++) {
            taskList.add(new BufferTask(sb));
        }

        Long start = System.currentTimeMillis();

        executor.invokeAll(taskList);

        System.out.println("-----StringBuffer-----");
        System.out.println("TAT : " + (System.currentTimeMillis() - start));
        System.out.println("length() : " + sb.length());
    }

    static class BufferTask implements Callable<Integer> {
        private StringBuffer sb;

        public BufferTask(StringBuffer sb) {
            this.sb = sb;
        }

        @Override
        public Integer call() throws Exception {
            for(int i = 0; i < 10000; i++) {
                sb.append("#");
            }
            return null;
        }
    }
}