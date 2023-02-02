package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Nursalim");
        builder.add("AL").add("Farizi");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify(){
        Stream<Object> stream = Stream.builder().add("Nursalim").add("Al").add("Farizi").build();
        stream.forEach(System.out::println);

    }

}
