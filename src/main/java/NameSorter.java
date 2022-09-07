import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class NameSorter {

    public String nameListToString(List<String> namesList) {
        return IntStream.range(0, namesList.size())
                .boxed()
                .filter(x -> x % 2 == 1)
                .map(x -> x + "." + namesList.get(x))
                .collect(Collectors.joining(","));
    }
}
