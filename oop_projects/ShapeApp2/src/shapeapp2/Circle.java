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
public class Circle extends Shape{
    private double radius;
    private static int count;

    public Circle() {
        this.radius = 1;
        count++;
    }

    public Circle(double radius, Point point) {
        super(point);
        this.radius = radius;
        count++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Circle.count = count;
    }

    @Override
    public String toString() {
        return "Circle->Center: " + super.toString() +  ", radius: " + radius ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if(!super.equals(obj))
            return false;
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        return true;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    public double diameter() {
        return 2*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    
    
    
    
    
}
