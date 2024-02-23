package main;

import second.Item;

// for the top level declarations (class or interface) we can use only public and default
public class Main {

    public static void main(String[] args) {
        // fields
        Item pencil = new Item("Pencil", "Blue");
//        pencil.name; not visible
//        pencil.color; not visible
//        pencil.size; not visible
        pencil.isUsed = true; // isUsed is public, so visible anywhere

        // constructors
//        Item book = new Item();  no-args constructor Item() is private
//        Item ball = new Item("Ball"); // default, package-private
//        Item bag = new Item("Bag", "Brown", "Medium"); // protected
        Item chair = new Item("Chair", "Red"); // public

        // methods
//        pencil.getName(); // private
//        pencil.setName("Whatever"); // default, package-private
//        pencil.getSize(); // protected
        pencil.isUsed(); // public
    }
}