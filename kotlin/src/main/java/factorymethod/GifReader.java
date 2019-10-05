package factorymethod;

public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
