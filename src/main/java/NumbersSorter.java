import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersSorter {

    List<Integer> numberArr = Arrays.asList(1, 2, 0, 4, 5);

    public String sortNumbers() {
        StringJoiner joiner = new StringJoiner(",");
        Stream<Integer> numbers = numberArr
                .stream()
                .sorted();
        List<Integer> sortedNumbers = numbers.collect(Collectors.toList());
        for (Integer number : sortedNumbers) {
            joiner.add(String.valueOf(number));
        }
        return joiner.toString();
    }
}
