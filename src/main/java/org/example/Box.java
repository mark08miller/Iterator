package org.example;

public class Box implements Collection {
    private String color;
    private int height;
    private int weight;
    private String[] things;

    public Box(String color, int height, int weight, String[] things) {
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.things = things;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String[] getThings() {
        return things;
    }

    public void setThings(String[] things) {
        this.things = things;
    }

    @Override
    public Iterator getIterator() {
        return new ThingsIterator();
    }
    private class ThingsIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < things.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return things[index++];
        }
    }
}
