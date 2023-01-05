package org.example;

public class Main {
    public static void main(String[] args) {
        String[] things = {"canned food", "pasta", "oil", "rice"};
        Box box = new Box("blue", 20, 15, things);
        Iterator iterator = box.getIterator();
        System.out.println("Box " + box.getColor());
        System.out.println("Things : ");

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}