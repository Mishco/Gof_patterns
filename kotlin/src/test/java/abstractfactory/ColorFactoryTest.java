package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorFactoryTest {

    @Test
    void create() {
        ColorFactory colorFactory = new ColorFactory();
        assertEquals(Color.class, colorFactory.create("red").getClass());
        assertEquals(Color.class, colorFactory.create("green").getClass());
    }
}