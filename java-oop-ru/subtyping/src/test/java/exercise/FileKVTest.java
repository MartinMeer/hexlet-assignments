package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // BEGIN
    @Test
    public void TestSaveMapToFile() {
        KeyValueStorage storage = new FileKV("src/test/resources/file", Map.of("key", "value"));
        storage.set("key1", "value1");
        storage.saveMapToFile();
        Map json = Utils.deserialize(Utils.readFile("src/test/resources/file"));
        assertThat(storage.get("key1", "value1")).isEqualTo("value1");
        assertThat(storage.toMap()).isEqualTo(json);
    }
    // END
}