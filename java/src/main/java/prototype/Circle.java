package prototype;

class Circle extends Shape {

    Circle() {
        super.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
