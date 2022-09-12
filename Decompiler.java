public class Decompiler {
    public static void main(String[] args) {
        new ReactNativeDetector().decompileAPK("apk_files", "00D02BB2EA9528543DD274A68E1DDEDCA4D49C52B9887821BAA101545D6F40F2.apk");
    }

      public void decompileAPK(String directory) {
        try {
            List<String> files = searchAPKFile(directory, "");
            Runtime rt = Runtime.getRuntime();

            for (String file:files){
                rt.exec(String.format("jadx %s", file));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void decompileAPK(String directory, String apkFile) {
        try {
            Runtime rt = Runtime.getRuntime();
            rt.exec(String.format("jadx %s", directory + "/" + apkFile));
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