package java_patterns.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Rectangle extends Shape {
    Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    void draw() {
       log.info("Inside Rectangle :: draw method");
    }
}
