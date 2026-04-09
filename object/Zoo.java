import java.util.*;

abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}
}

class Bird extends Animal {
	public Bird(String name) {
		super(name);
	}
}

public class Zoo<T extends Animal> {
	private List<T> animals = new ArrayList<>();

	public void addAnimal(T animal) {
		animals.add(animal);
	}

	// Хэрэгжүүл: transferAnimals
	public void transferAnimals(List<? extends T> source, List<? super T> destination) {
		// Бүх амьтдыг source-оос destination руу шилжүүл
		for (T animal : source) {
			destination.add(animal);
		}
	}

	public List<T> getAnimals() {
		return animals;
	}
}