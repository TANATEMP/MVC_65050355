public abstract class Animal {
    protected String id;

    public Animal(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public abstract String getType();
}
