package prototype;

class Rectangle extends Shape {
    Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle :: draw method");
    }
}
