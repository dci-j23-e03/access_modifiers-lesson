package second;

// if we have public, it will be visible in the main package
// if we have default, it will not be visible in the main package
public class Item {
    private String name;
    String color;
    protected String size;
    public boolean isUsed;

    private Item() {}

    Item(String name) {
        this.name = name;
    }

    protected Item(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public Item(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private String getName() {
        return name;
    }

    void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    protected String getSize() {
        return size;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public static void testConstructorsVisibility() {
        Item book = new Item(); // able to use private constructor inside of the same class

        Item ball = new Item("Ball"); // default

        Item bag = new Item("Bag", "Brown", "Medium"); // protected

        Item chair = new Item("Chair", "Red"); // public
    }

    public void testMethods() {
        // albe to call all methods from the same class
        this.getName();
        this.setName("Whatever");
        this.getSize();
        this.isUsed();
    }
}
