import java.util.stream.Stream;

public class LinearCongruentialGenerator {

    public static Stream<Long> numberRandomizer(long seed, long a, long c, long m ) {
        if (m < 0 || m == 0) {
            System.out.println("Inserted incorrect module");
            return null;
        }
        if (a <= 0 || a >= m) {
            System.out.println("Inserted incorrect multiplier");
            return null;
        }
        if (c < 0 || c >= m) {
            System.out.println("Inserted incorrect increment");
            return null;
        }
        if (seed < 0 || seed >= m) {
            System.out.println("Inserted incorrect seed");
            return null;
        }
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(10); // added limit for testing
    }
}
