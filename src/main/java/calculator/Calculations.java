package calculator;

public class Calculations {
    public double getPerimeter(double a) {
        return a * 4;
    }

    public double getSmallerAngleA(double a, double h) {
        return Math.toDegrees(Math.asin(h / a));
    }

    public double getArea(double a, double h) {
        return a * h;
    }

    public double getLongerDiagonal(double a, double h, double A) {
        return Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(a, 2) * Math.cos(Math.toRadians(A)));
    }

    public double getShorterDiagonal(double a, double h, double A) {
        return Math.sqrt(2 * Math.pow(a, 2) - 2 * Math.pow(a, 2) * Math.cos(Math.toRadians(A)));
    }
}
