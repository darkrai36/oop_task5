package ru.vsu.cs.sis.oop_task5;

public class Vector2D implements Vector {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double dotProduct(Vector other) {
        if (other instanceof Vector2D) {
            Vector2D v = (Vector2D) other;
            return this.x * v.x + this.y * v.y;
        }
        throw new IllegalArgumentException("Vector must be 2D");
    }

    @Override
    public Vector crossProduct(Vector other) {
        throw new UnsupportedOperationException("Cross product is not defined for 2D vectors");
    }

    @Override
    public double angleBetween(Vector other) {
        if (other instanceof Vector2D) {
            Vector2D v = (Vector2D) other;
            double dot = this.dotProduct(v);
            double magProduct = this.magnitude() * v.magnitude();
            return Math.acos(dot / magProduct);
        }
        throw new IllegalArgumentException("Vector must be 2D");
    }
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }
    public Vector2D multiply(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }
    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }
}
