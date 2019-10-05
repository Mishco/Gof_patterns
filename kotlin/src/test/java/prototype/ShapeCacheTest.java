package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeCacheTest {

    @Test
    void testPrototypeDemo() {
        ShapeCache.loadCache();

        assertEquals("Circle", ShapeCache.getShape("1").getType());
        assertEquals("Square", ShapeCache.getShape("2").getType());
        assertEquals("Rectangle", ShapeCache.getShape("3").getType());
    }
}