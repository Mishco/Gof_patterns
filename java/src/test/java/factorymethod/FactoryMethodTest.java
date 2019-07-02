package factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FactoryMethodTest {

    @Test
    void getDecodedImage() {
        FactoryMethod factoryMethod = new FactoryMethod("tento.gif");
        assertEquals("DecodedImage{image='tento.gif'}", factoryMethod.getDecodedImage().toString());
    }

    @Test
    void getJpegReader() {
        FactoryMethod factoryMethod = new FactoryMethod("tento.jpeg");
        assertEquals("DecodedImage{image='tento.jpeg'}", factoryMethod.getDecodedImage().toString());
    }

    @Test
    void getInvalidReader() {
        Assertions.assertThrows(RuntimeException.class, () -> new FactoryMethod("tento.raw"));
    }


}