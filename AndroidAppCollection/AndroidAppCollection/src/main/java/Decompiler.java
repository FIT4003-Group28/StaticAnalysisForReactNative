import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Decompiler {
    public void decompileApksFromJSON(String jsonFile){
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(jsonFile))
        {
            JSONObject fileContent = (JSONObject) jsonParser.parse(reader);

            String directory = (String) fileContent.get("directory");
            JSONArray files = (JSONArray) fileContent.get("files");

            for (Object file : files){
                decompileAPK(directory, file.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    };


    public void decompileAPKs(String directory) {
        try {
            List<String> files = searchFiles(directory, ".apk");
            Runtime rt = Runtime.getRuntime();

            for (String file :files){
                decompileAPK(directory, file.toString().split("/")[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Process completed");
        }
    }

    public void decompileAPK(String directory, String apkFile) {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] jadxCommand = {"jadx", directory + "/" + apkFile};
            Process p = rt.exec(jadxCommand);
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(apkFile + " decompiled successfully");
        }
    }

    // Modified
    // https://stackoverflow.com/questions/43951890/locating-file-in-the-hard-disk-using-java-just-like-the-os-walk-in-python
    private List<String> searchFiles(String path, String searchString) throws Exception {
        Stream<Path> paths = Files.walk(Paths.get(path));
        try {
            List<String> files = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().contains(searchString))
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