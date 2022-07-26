package calculator;

import junit.framework.TestCase;

public class CalculationsTest extends TestCase {
    double sideLength = 6;
    double height = 4;
    Calculations c = new Calculations();


    public void testGetPerimeter() {
        double expectedP = 24;
        double actualP = c.getPerimeter(sideLength);
        assertEquals(expectedP, actualP);
    }

    public void testGetSmallerAngleA() {
        double expectedSmallerAngleA = 41.810314895778596;
        double actualAngleA = c.getSmallerAngleA(sideLength, height);
        assertEquals(expectedSmallerAngleA, actualAngleA);
    }

    public void testGetArea() {
        double expectedArea = 24;
        double actualArea = c.getArea(sideLength, height);
        assertEquals(expectedArea, actualArea);
    }

    public void testGetLongerDiagonal() {
        double expectedDiagonal = 11.21006830755259;
        double actualDiagonal = c.getLongerDiagonal(sideLength, height, c.getSmallerAngleA(sideLength, height));
        assertEquals(expectedDiagonal, actualDiagonal);
    }

    public void testGetShorterDiagonal() {
        double expectedDiagonal = 4.281865077277079;
        double actualDiagonal = c.getShorterDiagonal(sideLength, height, c.getSmallerAngleA(sideLength,height));
        assertEquals(expectedDiagonal, actualDiagonal);
    }
}