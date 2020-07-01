package pj_01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringBuilderTest {

    public static void main (String... args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        StringBuilder sb = new StringBuilder();
        List<BuilderTask> taskList = new ArrayList<BuilderTask>();

        for(int i = 0; i < 100; i++) {
            taskList.add(new BuilderTask(sb));
        }

        Long start = System.currentTimeMillis();

        executor.invokeAll(taskList);

        System.out.println("-----StringBuilder-----");
        System.out.println("TAT : " + (System.currentTimeMillis() - start));
        System.out.println("length() : " + sb.length());
    }

    static class BuilderTask implements Callable<Integer> {
        private StringBuilder sb;

        public BuilderTask(StringBuilder sb) {
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