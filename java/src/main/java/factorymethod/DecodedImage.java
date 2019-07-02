package factorymethod;

public class DecodedImage {
    private String image;

    DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DecodedImage{" +
                "image='" + image + '\'' +
                '}';
    }
}
