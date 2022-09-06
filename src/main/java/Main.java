import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Ivan", "Peter", "Michael", "Yuta", "Arthur", "Alex");
        NameSorter sorter = new NameSorter();
        System.out.println(sorter.nameListToString(namesList));
        System.out.println("-----------");
        AlphabeticNameSorter alphabeticNameSorter = new AlphabeticNameSorter();
        System.out.println(alphabeticNameSorter.sortByAlphabet(namesList));
        System.out.println("-----------");
        NumbersSorter numbersSorter = new NumbersSorter();
        System.out.println(numbersSorter.sortNumbers());
        System.out.println("-----------");
        LinearCongruentialGenerator.numberRandomizer(0, 25214903917L, 11, (long)(Math.pow(2, 48)))
                .forEach(System.out :: println);
        System.out.println("-----------");
        Stream<String> firstStream = Stream.of("Ivan", "Peter", "Michael");
        Stream<String> secondStream = Stream.of("Yuta", "Arthur", "Alex", "Sir John Ronald Reuel Tolkien");
        StreamMixer.zip(firstStream, secondStream).forEach(System.out :: println);
        System.out.println("-----------");
    }
}
