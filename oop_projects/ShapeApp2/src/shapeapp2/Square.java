/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeapp2;

/**
 *
 * @author Android
 */
public class Square extends Rectangle{
    private static int count;

    public Square() {
        count++;
    }

    public Square(double width, Point point) {
        super(width, width, point);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Square.count = count;
    }

    @Override
    public String toString() {
        return "Square->Starting point: " + super.getPoint() + ", width=" + super.getWidth();
    }
    
}
