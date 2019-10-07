package java_patterns.factorymethod;

class FactoryMethod {
    private DecodedImage decodedImage;
    private ImageReader reader;

    FactoryMethod(String image) {
        String format = image.substring(image.indexOf('.') + 1);
        switch (format) {
            case "gif":
                reader = new GifReader(image);
                break;
            case "jpeg":
                reader = new JpegReader(image);
                break;
            default:
                throw new RuntimeException("Not supported format");
        }
        decodedImage = reader.getDecodedImage();
    }

    DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
