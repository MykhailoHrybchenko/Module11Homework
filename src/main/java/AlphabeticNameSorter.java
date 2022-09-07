import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlphabeticNameSorter {

    public List<String> sortByAlphabet(List<String> namesList) {
        return  namesList
                .stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
