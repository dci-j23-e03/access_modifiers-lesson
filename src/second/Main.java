package second;

public class Main {

    public static void main(String[] args) {

        // fields
        Item pencil = new Item("Pencil", "Black");
//        pencil.name = "New pencil"; won't work, because name is private, visible only inside the Item class
        pencil.color = "Orange"; // color is default, so visible inside the same package
        pencil.size = "Small";  // size is protected so visible in the same package
        pencil.isUsed = true; // isUsed is public, so visible anywhere

        // constructors
//        Item book = new Item();  no-args constructor Item() is private
        Item ball = new Item("Ball"); // default, package-private
        Item bag = new Item("Bag", "Brown", "Medium"); // protected
        Item chair = new Item("Chair", "Red"); // public

        // methods
//        pencil.getName(); private
        pencil.setName("Whatever"); // default, package-private
        pencil.getSize(); // protected
        pencil.isUsed(); // public
    }
}
