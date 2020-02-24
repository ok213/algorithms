package main.algo;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Fork(1)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@BenchmarkMode(Mode.AverageTime)
@Threads(1)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class PerformanceTest {
    private static List<Object> arrayList;
    private static List<Object> linkedList;

    private static final int count = 100_000;

    public static void main(String[] args) throws Exception {

        Options opt = new OptionsBuilder()
                .include(PerformanceTest.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Setup
    public static void setup() {
        arrayList = new ArrayList<>(count);
        linkedList = new LinkedList<>();

        for (int i = 0; i < count; i++)
            arrayList.add(new Object());

        linkedList.addAll(arrayList);
    }

    @Benchmark
    public void removeFromLinkedList(Blackhole blackhole) throws Exception {
        Object object = new Object();
        linkedList.remove(count / 2);
        linkedList.add(count / 2, object);
    }

    @Benchmark
    public void removeFromArrayList(Blackhole blackhole) throws Exception {
        Object object = new Object();
        arrayList.remove(count / 2);
        arrayList.add(count / 2, object);
    }
}
