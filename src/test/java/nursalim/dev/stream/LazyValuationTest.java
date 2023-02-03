package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {
    @Test
    void testIntermediateOperation(){
        List<String> names = List.of("Nursalim", "Al", "Farizi");
        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to uppercase");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation(){
        List<String> names = List.of("Nursalim", "Al", "Farizi");
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to uppercase");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Add prefix Mr. " + upper);
                    return "Mr. " + upper.toUpperCase();
                })
                .forEach(System.out::println);
    }
}
