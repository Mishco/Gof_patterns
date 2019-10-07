package java_patterns.abstractfactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color create(String color) {
        return new Color(color);
    }
}
