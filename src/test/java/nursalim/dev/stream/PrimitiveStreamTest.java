package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {

    @Test
    void testCreate(){
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(System.out::println);

        IntStream range = IntStream.range(1, 20);
//        range.forEach(System.out::println);

        LongStream longStream = LongStream.range(1, 10);
        DoubleStream doubleStream = DoubleStream.builder().add(1.0).add(5.3).add(10.2).build();
        doubleStream.forEach(System.out::println);

    }

    @Test
    void testOperation(){
        OptionalDouble average = IntStream.of(1, 2, 3, 4, 5).average();
        average.ifPresent(System.out::println);
    }
}
