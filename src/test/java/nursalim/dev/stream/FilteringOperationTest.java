package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilter(){
        List.of("Nursalim", "Al Farizi", "Brebes", "Indriyani", "Nani", "Ziah").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(value -> value%2 == 0)
                .forEach(System.out::println);

    }

    @Test
    void testDistinct(){
        List.of("Nursalim", "Al Farizi", "Nursalim", "Indriyani", "Nursalim", "Ziah").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
