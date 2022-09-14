import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Decompiler {
      public void decompileAPK(String directory) {
        try {
            List<String> files = searchAPKFile(directory, "");
            Runtime rt = Runtime.getRuntime();

            for (String file :files){
                String[] jadxCommand = {"jadx", file};
                rt.exec(jadxCommand);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void decompileAPK(String directory, String apkFile) {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] jadxCommand = {"jadx", directory + "/" + apkFile};
            rt.exec(jadxCommand);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Modified
    // https://stackoverflow.com/questions/43951890/locating-file-in-the-hard-disk-using-java-just-like-the-os-walk-in-python
    private List<String> searchAPKFile(String path, String searchString) throws Exception {
        Stream<Path> paths = Files.walk(Paths.get(path));
        try {
            List<String> files = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().contains(searchString)
                            && p.getFileName().toString().contains(".apk"))
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