package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation(){
        List<String> names = List.of("Nursalim", "Al", "Farizi");
        Stream<String> streamNames = names.stream();
        Stream<String> streamNamesUpper = streamNames.map(name -> name.toUpperCase());
        streamNamesUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
