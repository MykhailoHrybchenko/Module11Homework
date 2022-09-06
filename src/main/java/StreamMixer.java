import java.util.Iterator;
import java.util.stream.Stream;

public class StreamMixer {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            resultStream = Stream.concat(resultStream, Stream.of(iterator1.next(), iterator2.next()));
        }
        return resultStream;
    }
}
