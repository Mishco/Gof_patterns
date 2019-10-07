package java_patterns.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Circle extends Shape {

    Circle() {
        super.type = "Circle";
    }

    @Override
    void draw() {
        log.info("Inside Circle::draw() method.");
    }
}
