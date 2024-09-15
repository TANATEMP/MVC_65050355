public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        TeatModel teatModel = new TeatModel();
        AnimalTypeModel animalTypeModel = new AnimalTypeModel(database);
        View view = new View();
        CowView cowView = new CowView();
        GoatView goatView = new GoatView();
        new Controller(animalTypeModel, teatModel, view, cowView, goatView);
    }
}
