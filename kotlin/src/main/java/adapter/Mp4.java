package adapter;

import java.util.regex.Pattern;

public class Mp4 implements MediaPackage {

    /**
     * System.out.printf("Playing Mp4 file: %s%n", filename);
     *
     * @param filename filename of playing file
     * @return postfix of file
     */
    @Override
    public String playFile(String filename) {
        String[] strings = filename.split(Pattern.quote("."));
        return strings[1];
    }
}
