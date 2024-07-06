/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeapp2;

import java.util.Objects;

/**
 *
 * @author Android
 */
public abstract class Shape implements Operation{
    private Point point;
    private static int count;

    public Shape() {
        count++;
    }

    public Shape(Point point) {
        this.point = point;
        count++;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Shape.count = count;
    }

    @Override
    public String toString() {
        return point.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.point);
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
        final Shape other = (Shape) obj;
        if (!Objects.equals(this.point, other.point)) {
            return false;
        }
        return true;
    }
    
    public abstract double perimeter();
    
}
