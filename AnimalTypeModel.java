public class AnimalTypeModel {
    private Database database;

    public AnimalTypeModel(Database database) {
        this.database = database;
    }

    public Animal getAnimal(String id) {
        return database.getAnimal(id);
    }

    public boolean isGoat(Animal animal) {
        return animal instanceof Goat;
    }

    public boolean isCow(Animal animal) {
        return animal instanceof Cow;
    }
}
