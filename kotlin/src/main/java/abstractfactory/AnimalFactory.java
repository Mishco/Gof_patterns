package abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "duck":
                return new Duck();
            default:
                return null;
        }
    }
}
