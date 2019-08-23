package prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public abstract class Shape implements Cloneable {

    @Setter
    private String id;
    protected String type;

    abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            log.warn(ex.getMessage());
        }
        return clone;
    }
}
