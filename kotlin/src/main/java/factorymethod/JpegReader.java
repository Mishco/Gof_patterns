package factorymethod;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    JpegReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
