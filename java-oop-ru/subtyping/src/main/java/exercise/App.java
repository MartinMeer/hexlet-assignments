package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> swappedMap = storage.toMap()
                        .entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        storage.setInMemoryMap(swappedMap);
    }
}
// END
