package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap(){
        List.of("Nursalim", "Al Farizi", "Brebes").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(System.out::println);
    }

    @Test
    void testFlatMap(){
        List.of("Nursalim", "Al Farizi", "Brebes").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(System.out::println);
    }
}
