package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    void testLimit(){
        List.of("Nursalim", "Al Farizi", "Brebes", "Indriyani", "Nani", "Ziah").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip(){
        List.of("Nursalim", "Al Farizi", "Brebes", "Indriyani", "Nani", "Ziah").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile(){
        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .takeWhile(name -> name.length() < 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile(){
        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .dropWhile(name -> name.length() < 5)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny(){
        Optional<String> any = List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .findAny();
        any.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst(){
        Optional<String> any = List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .findFirst();
        any.ifPresent(System.out::println);
    }
}
