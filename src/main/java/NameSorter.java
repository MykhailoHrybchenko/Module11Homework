import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameSorter {

    public String nameListToString(List<String> namesList) {
        int counter = 1;
        StringJoiner joiner = new StringJoiner(",");
        Stream<String> namesStream = namesList
            .stream()
            .filter(name -> namesList.indexOf(name) != 0 && namesList.indexOf(name) %2 != 0);
        List<String> filteredNames = namesStream.collect(Collectors.toList());
        for (String name : filteredNames) {
            joiner.add(" " + counter + "." + name);
            counter += 2;
        }
        return joiner.toString();
    }
}
