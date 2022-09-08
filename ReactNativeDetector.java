import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReactNativeDetector {

    public static void main(String[] args) {
        try {
            List<String> files = search("test", "a.txt");

            // To run command line instructions
            Runtime rt = Runtime.getRuntime();
            rt.exec("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // https://stackoverflow.com/questions/43951890/locating-file-in-the-hard-disk-using-java-just-like-the-os-walk-in-python
    public static List<String> search(String path, String searchString) throws Exception {
        Stream<Path> paths = Files.walk(Paths.get(path));
        try {
            List<String> files = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().toLowerCase().contains(searchString))
                    .map(p -> p.toString())
                    .collect(Collectors.toList());
            return files;
        } finally {
            if (null != paths) {
                paths.close();
            }
        }
    }
}
