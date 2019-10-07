package java_patterns.prototype;

import java.util.HashMap;

class ShapeCache {

    private ShapeCache() {
    }

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    static Shape getShape(String shapeID) {
        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape) cachedShape.clone();
    }

    static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");

        Square square = new Square();
        square.setId("2");

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");

        shapeMap.put(circle.getId(), circle);
        shapeMap.put(square.getId(), square);
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
