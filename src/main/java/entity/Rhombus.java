package entity;

public class Rhombus {
    private int sideLength;
    private int height;
    private final double PI = Math.PI;

    public Rhombus(int sideLength, int height) {
        this.sideLength = sideLength;
        this.height = height;
    }

    public double getPI() {
        return PI;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


