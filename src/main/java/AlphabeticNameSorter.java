import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlphabeticNameSorter {

    public List<String> sortByAlphabet(List<String> namesList) {
        Stream<String> namesStream = namesList
                .stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase);
        List<String> sortedList = namesStream.collect(Collectors.toList());
        return sortedList;
    }
}
