package adapter;


public class FormatAdapter implements MediaPlayer {

    private MediaPackage mediaPackage;

    FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    /**
     * System.out.print("Using adapter ==> ");
     *
     * @param file filename of playing file
     * @return postfix of filename
     */
    @Override
    public String play(String file) {
        return mediaPackage.playFile(file);
    }
}
