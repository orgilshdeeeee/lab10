import java.util.ArrayList;
import java.util.List;

public class ZooApp {
	public static void main(String[] args) {
		Zoo<Mammal> mammalZoo = new Zoo<>();
		mammalZoo.addAnimal(new Mammal("Арслан"));
		Zoo<Bird> birdZoo = new Zoo<>();
		birdZoo.addAnimal(new Bird("Тогоруу"));
		List<Animal> generalZoo = new ArrayList<>();
		mammalZoo.transferAnimals(mammalZoo.getAnimals(), generalZoo);
		birdZoo.transferAnimals(birdZoo.getAnimals(), generalZoo);
		generalZoo.forEach(a -> System.out.println(a.getName()));
	}

}