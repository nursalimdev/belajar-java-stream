package nursalim.dev.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OrderingOperationTest {

    @Test
    void testSorted(){
        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator(){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Comparator<String> reverseComparator = Comparator.reverseOrder();

//        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
//                .sorted(comparator)
//                .forEach(System.out::println);

        List.of("Nani", "Al Farizi", "Brebes", "Indriyani", "Budi", "Ziah").stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(System.out::println);



    }
}
