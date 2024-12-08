package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage{

    private Map<String, String> valuesMap;
    private String path;

    public FileKV(String path, Map<String, String> valuesMap) {
        this.path = path;
        this.valuesMap = new HashMap<>(valuesMap);
    }

    @Override
    public void set(String key, String value) {
        valuesMap.put(key, value);
    }

    @Override
    public void unset(String key) {
    }

    @Override
    public String get(String key, String defaultValue) {
        return valuesMap.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(valuesMap);
    }

    @Override
    public void setInMemoryMap(Map<String, String> inMemoryMap) {
    }

    @Override
    public void saveMapToFile() {

        String json = Utils.serialize(this.valuesMap);
        Utils.writeFile(this.path, json);
    }
}
// END
