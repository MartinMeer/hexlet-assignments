package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN

public class InMemoryKV implements KeyValueStorage{
    private Map<String, String> inMemoryMap;

    public InMemoryKV(Map<String, String> inMemoryMap) {
        this.inMemoryMap = new HashMap<>(inMemoryMap);
    }

    @Override
    public void set(String key, String value) {
        inMemoryMap.put(key, value);
    }

    @Override
    public void unset(String key) {
        inMemoryMap.remove(key);

    }

    @Override
    public String get(String key, String defaultValue) {
        return inMemoryMap.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(inMemoryMap);
    }

    @Override
    public void setInMemoryMap(Map<String, String> inMemoryMap) {
        this.inMemoryMap = inMemoryMap;
    }

    @Override
    public void saveMapToFile() {
    }
}
// END
