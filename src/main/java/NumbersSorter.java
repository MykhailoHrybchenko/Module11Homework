import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NumbersSorter {

    public List<String> numberArr = Arrays.asList("1, 2, 0", "4, 5");

    public static List<String> separate(List<String> list) {
        return list.stream()
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(x -> x.stream())
                .sorted()
                .collect(Collectors.toList());
    }
}
