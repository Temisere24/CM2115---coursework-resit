public abstract class Room {
    protected String name;
    protected String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void describe() {
        System.out.println("You are in the " + name + ".");
        System.out.println(description);
    }
    // problem method
    public abstract void problem(int answer, int roomNum, Player player);
}
