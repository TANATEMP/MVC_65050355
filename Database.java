import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Animal> animals = new ArrayList<>();

    public Database() {
        /*วัว */
        animals.add(new Cow("65050355", 3, 4, 4));
        animals.add(new Cow("12345678", 4, 3, 3));
        animals.add(new Cow("92345678", 7, 3, 3));
        animals.add(new Cow("23456789", 5, 4, 4));
        animals.add(new Cow("34567890", 2, 4, 4));
        animals.add(new Cow("45678901", 8, 3, 3));
        animals.add(new Cow("56789012", 1, 4, 4));
        animals.add(new Cow("67890123", 6, 3, 3));
        animals.add(new Cow("78901234", 9, 4, 4));
        animals.add(new Cow("89012345", 10, 3, 3));
        animals.add(new Cow("90123456", 4, 4, 4));
        animals.add(new Cow("01234567", 7, 4, 4));
        animals.add(new Cow("13579246", 5, 3, 3));
        animals.add(new Cow("24680135", 3, 4, 4));
        animals.add(new Cow("35791357", 2, 3, 3));
        /*แพะ */
        animals.add(new Goat("87654321"));
        animals.add(new Goat("23062546"));
    }

    public Animal getAnimal(String id) {
        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        return null;
    }
}
