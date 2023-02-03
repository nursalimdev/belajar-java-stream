package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax(){
        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin(){
        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount(){
        long count = List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .count();
        System.out.println(count);

    }

    @Test
    void testSum(){
        Integer sum = List.of(10, 15, 5, 30, 60).stream()
                .reduce(0, (result, item) -> result + item);
        System.out.println(sum);

    }

    @Test
    void testFactorial(){
        Integer factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (result, item) -> result * item);
        System.out.println(factorial);

    }
}
