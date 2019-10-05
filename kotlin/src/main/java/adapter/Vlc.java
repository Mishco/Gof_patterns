package adapter;

import java.util.regex.Pattern;

public class Vlc implements MediaPackage {
    /**
     * System.out.printf("Playing Vlc file: %s%n", filename);
     *
     * @param filename filename of playing file
     * @return postfix of filename
     */
    @Override
    public String playFile(String filename) {
        String[] strings = filename.split(Pattern.quote("."));
        return strings[1];
    }
}
