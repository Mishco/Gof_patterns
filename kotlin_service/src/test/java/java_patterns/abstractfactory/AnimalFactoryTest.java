package java_patterns.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AnimalFactoryTest {

    @Test
    void create() {
        AnimalFactory animalFactory = new AnimalFactory();
        assertEquals(Dog.class, animalFactory.create("dog").getClass());
        assertEquals(Dog.class, animalFactory.create("Dog").getClass());

        assertEquals(Duck.class, animalFactory.create("duck").getClass());
        assertEquals(Duck.class, animalFactory.create("DuCK").getClass());
    }

    @Test
    void invalidCreate() {
        AnimalFactory animalFactory = new AnimalFactory();
        assertNull(animalFactory.create(""));
        assertNull(animalFactory.create("adsf232345//w4123]]\\\\[['';;..//"));
    }

    @Test
    void testCreationDog() {
        AnimalFactory animalFactory = new AnimalFactory();
        Dog dog = (Dog) animalFactory.create("dog");
        assertEquals("Dog", dog.getAnimal());
        assertEquals("Baf", dog.makeSound());
    }

}