from __future__ import annotations

from abc import abstractmethod, ABC


# Abstract part

class AbstractFactory(ABC):

    @abstractmethod
    def create_product_a(self) -> AbstractProductA:
        pass

    @abstractmethod
    def create_product_b(self) -> AbstractProductB:
        pass


class AbstractProductA(ABC):

    @abstractmethod
    def useful_function_a(self) -> str:
        pass


class AbstractProductB(ABC):
    @abstractmethod
    def useful_function_b(self) -> None:
        pass

    def another_useful_function_b(self, collaborator: AbstractProductA) -> None:
        pass


# Concrete factory

class ConcreteFactoryForDieselCars(AbstractFactory):

    def create_product_a(self) -> ConcreteProductDieselA:
        return ConcreteProductDieselA()

    def create_product_b(self) -> ConcreteProductDieselB:
        return ConcreteProductDieselB()


class ConcreteFactoryForElectricCars(AbstractFactory):
    def create_product_a(self) -> ConcreteProductElectricA:
        return ConcreteProductElectricA()

    def create_product_b(self) -> ConcreteProductElectricB:
        return ConcreteProductElectricB()


class ConcreteProductDieselA(AbstractProductA):
    def useful_function_a(self) -> str:
        return "The result of the product A1."


class ConcreteProductElectricA(AbstractProductA):
    def useful_function_a(self) -> str:
        return "The result of the product A2."


class ConcreteProductDieselB(AbstractProductB):
    def useful_function_b(self) -> str:
        return "The result of the product Diesel."

    def another_useful_function_b(self, collaborator: AbstractProductA) -> str:
        result = collaborator.useful_function_a()
        return f"The result of the Diesel collaborating with the ({result})"


class ConcreteProductElectricB(AbstractProductB):
    def useful_function_b(self) -> str:
        return "The result of the product Electric."

    def another_useful_function_b(self, collaborator: AbstractProductA):
        result = collaborator.useful_function_a()
        return f"The result of the Electric collaborating with the ({result})"


def client_code(factory: AbstractFactory) -> None:
    product_a = factory.create_product_a()
    product_b = factory.create_product_b()

    print(f"{product_b.useful_function_b()}")
    print(f"{product_b.another_useful_function_b(product_a)}", end="")


if __name__ == '__main__':
    print("Testing client code with the factory type: ")
    client_code(ConcreteFactoryForDieselCars())

    print()

    print("Testing client the same client with the second factory type: ")
    client_code(ConcreteFactoryForElectricCars())
