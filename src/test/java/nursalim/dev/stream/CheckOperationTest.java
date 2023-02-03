package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {
    @Test
    void testAnyMatch(){
        boolean any = List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .anyMatch(item -> item.length() > 6);
        System.out.println(any);

    }

    @Test
    void testAllMatch(){
        boolean all = List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .allMatch(item -> item.length() > 6);
        System.out.println(all);

    }

    @Test
    void testNoneMatch(){
        boolean none = List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .noneMatch(item -> item.length() > 0);
        System.out.println(none);

    }
}
