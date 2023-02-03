package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {
    Stream<String> getStream(){
        return Stream.of("Nursalim", "Al", "Farizi", "Brebes", "Losari");
    }

    @Test
    void testCollection(){
        Set<String> set = getStream().collect(Collectors.toSet());
        Set<String> unModifiableSet = getStream().collect(Collectors.toUnmodifiableSet());


        List<String> list = getStream().collect(Collectors.toList());
        List<String> unModifiableList = getStream().collect(Collectors.toUnmodifiableList());
    }

    @Test
    void testMap(){
        Map<String, String> map = getStream().collect(Collectors.toMap(name -> name.toLowerCase(), name -> name + " - " + name.length()));
        System.out.println(map);

    }
}
