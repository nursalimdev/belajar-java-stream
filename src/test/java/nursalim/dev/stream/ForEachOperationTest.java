package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
//    @Test
//    void testPeekBefore(){
//        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
//                .peek(name -> System.out.println("Before change the name to upper " + name))
//                .map(name -> name.toUpperCase());
//    }

    @Test
    void testPeekAfter(){
        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .peek(name -> System.out.println("Before change the name to upper " + name))
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println("After change the name to upper " + name))
                .forEach(name -> System.out.println("Final name " + name));
    }

}
