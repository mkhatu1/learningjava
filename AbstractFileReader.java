import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractFileReader {
    private final Path filePath;

    // constructor
    protected AbstractFileReader(String filePath){
        this.filePath = Path.of(filePath);
    }

    // getter to get file path string
    public String getPath(){
        return filePath.toString();
    }

    // algorithm to read file and turn them into list of strings.
    public List<String> readFile() throws IOException {
        return Files.lines(filePath)
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    protected abstract String parseLine(String line);
}