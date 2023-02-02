package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testCreateStreamPipeline(){
        List<String> list = List.of("Nursalim", "Al", "Farizi");
        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);

    }
}
