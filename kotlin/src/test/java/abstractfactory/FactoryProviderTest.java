package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryProviderTest {

    @Test
    void getFactory() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Animal");
        assert abstractFactory != null;
        assertEquals(Dog.class, abstractFactory.create("Dog").getClass());
        assertEquals(Duck.class, abstractFactory.create("duck").getClass());

        abstractFactory = FactoryProvider.getFactory("Color");
        assert abstractFactory != null;
        assertEquals(Color.class, abstractFactory.create("red").getClass());
    }
}