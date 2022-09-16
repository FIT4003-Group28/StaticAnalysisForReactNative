import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

public class ReactNativeDetector {

    public void extractBundleFiles(String directory) {
        try {
            List<String> files = Files.walk(Paths.get(directory)).filter(Files::isDirectory).filter(p -> countNumberOfChar(p.toString(), '/') == 1).map(Path::toString).collect(Collectors.toList());
            for (String file : files) {
                extractBundleFile(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void extractBundleFile(String appDirectory) {
        try {
            Files.walk(Paths.get(appDirectory)).forEach(source -> {
                if (source.toString().contains("index.android.bundle")) {
                    String destinationDir = "reactnative_bundle_files" + "/" + appDirectory.substring(appDirectory.lastIndexOf("/") + 1);
                    File f = new File(destinationDir);
                    if (!f.exists()) {
                        f.mkdir();
                    }

                    try {
                        Files.copy(source, new File(destinationDir + "/" + source.toString().substring(source.toString().lastIndexOf("/") + 1)).toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int countNumberOfChar(String inputString, char character){
        int count = 0;
        for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) == character){
                count++;
            }
        }
        return count;
    }
}

