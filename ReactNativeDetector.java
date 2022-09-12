import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.nio.file.StandardCopyOption;

public class ReactNativeDetector {
    public void extractBundleFile(String apkFilePath) {
        try {
            Files.walk(Paths.get(apkFilePath)).forEach(source -> {
                if (source.toString().contains("index.android.bundle")) {
                    System.out.println(source);
                    String destinationDir = "reactnative_bundle_files" + "/" + apkFilePath.substring(apkFilePath.lastIndexOf("/") + 1);
                    File f = new File(destinationDir);
                    if (!f.exists()) {
                        f.mkdir();
                    }

                    try {
                        Files.copy(source, new File(destinationDir + "/index.android.bundle").toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
