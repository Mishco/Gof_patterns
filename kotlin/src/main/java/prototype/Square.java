package prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Square extends Shape {

    Square() {
        super.type = "Square";
    }

    @Override
    void draw() {
        log.info("Inside Square::draw() method.");
    }

}
