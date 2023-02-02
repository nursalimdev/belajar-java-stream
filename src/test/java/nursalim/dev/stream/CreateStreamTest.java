package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream(){
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> System.out.println(data));

        Stream<String> one = Stream.of("Nursalim");
        one.forEach(data -> System.out.println(data));

        Stream<String> nullStream = Stream.ofNullable(null);
        nullStream.forEach(data -> System.out.println(data));
    }

    @Test
    void testCreateStreamFromArray(){
        Stream<String> arrayStream = Stream.of("Nursalim", "AL", "Farizi");
        arrayStream.forEach(data -> System.out.println(data));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(data -> System.out.println(data));

        String[] array = new String[] {"Nursalim", "AL", "Farizi"};
        Stream<String> streamString = Arrays.stream(array);
        streamString.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection(){
        Collection<String> names = List.of("Nursalim", "Al", "Farizi");
        Stream<String> stringStream = names.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream(){
        Stream<String> stream = Stream.generate(() -> "Nursalim");
//        stream.forEach(System.out::println); // will reproduce infinite loop

        Stream<Integer> iterateStream = Stream.iterate(1, value -> value + 1);
//        iterateStream.forEach(System.out::println);
    }
}
