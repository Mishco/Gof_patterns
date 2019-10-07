package java_patterns.adapter;

import java.util.regex.Pattern;

public class Mp3 implements MediaPlayer {

    /**
     * System.out.printf("Playing MP3 file: %s %n", file);
     *
     * @param file filename of file
     * @return postfix of file
     */
    @Override
    public String play(String file) {

        String[] strings = file.split(Pattern.quote("."));
        return strings[1];
    }
}
