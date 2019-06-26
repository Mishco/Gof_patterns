package singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SingletonTests {

    @Test
    void testNotNullSingleton() {
        Singleton singleton = Singleton.getInstance();
        Assertions.assertNotNull(singleton);
    }

    @Test
    void testOnlyOneInstanceExists() {
        Singleton singletonFirst = Singleton.getInstance();
        Singleton singletonSecond = Singleton.getInstance();

        assertEquals(singletonFirst, singletonSecond);
    }

    @Test
    void testUsingReflectionOfSingletonClass() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> classObj = Class.forName("singleton.Singleton");
        Field field = classObj.getDeclaredField("instance");
        field.setAccessible(true);

        // set to null
        field.set(field, null);

        // instance is null
        assertNull(Singleton.getInstance());
    }

}
