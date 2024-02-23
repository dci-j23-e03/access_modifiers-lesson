package main;

import second.Item;

public class Pencil extends Item {
    public Pencil(String name, String color) {
        super(name, color);
    }

    // calling a parent no-args constructor not possible because it is private
//    public Pencil() {
//        super();
//    }

    // calling Item(String) not possible since it is package-private
//    public Pencil(String name) {
//        super(name);
//    }

    // calling Item(String,String,String) is possible since it is protected, and we are in the subclass
    public Pencil(String name, String color, String size) {
        super(name, color, size);
    }

    // size is a protected, so generally not visible out of the package, unless for the subclasses
    public void testSizeFieldAccess() {
        System.out.println(super.size);
    }

    public void testItemMethods() {
//        super.getName(); // private
//        super.setName("Whatever"); // default, package-private
        super.getSize(); // protected
        super.isUsed(); // public
    }
}
