package java_patterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatAdapterTest {

    @Test
    void testMediaPlayerAdapter() {
        MediaPlayer player = new Mp3();
        assertEquals("mp3", player.play("song.mp3"));

        player = new FormatAdapter(new Mp4());
        assertEquals("mp4", player.play("song.mp4"));

        player = new FormatAdapter(new Vlc());
        assertEquals("avi", player.play("movie.avi"));
    }

    @Test
    void testMediaPlayerAdapterDoesNotExists() {
        MediaPlayer player = new FormatAdapter(filename -> "nothing.unknown");
        assertEquals("nothing.unknown" , player.play("whatever.nnnn"));
    }
}