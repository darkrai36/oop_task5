package ru.vsu.cs.sis.oop_task5;

public class Vector3D implements Vector {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public double dotProduct(Vector other) {
        if (other instanceof Vector3D) {
            Vector3D v = (Vector3D) other;
            return this.x * v.x + this.y * v.y + this.z * v.z;
        }
        throw new IllegalArgumentException("Vector must be 3D");
    }

    @Override
    public Vector crossProduct(Vector other) {
        if (other instanceof Vector3D) {
            Vector3D v = (Vector3D) other;
            double crossX = this.y * v.z - this.z * v.y;
            double crossY = this.z * v.x - this.x * v.z;
            double crossZ = this.x * v.y - this.y * v.x;
            return new Vector3D(crossX, crossY, crossZ);
        }
        throw new IllegalArgumentException("Vector must be 3D");
    }

    @Override
    public double angleBetween(Vector other) {
        if (other instanceof Vector3D) {
            Vector3D v = (Vector3D) other;
            double dot = this.dotProduct(v);
            double magProduct = this.magnitude() * v.magnitude();
            return Math.acos(dot / magProduct);
        }
        throw new IllegalArgumentException("Vector must be 3D");
    }

    // Операция сложения
    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    // Умножение на скаляр
    public Vector3D multiply(double scalar) {
        return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    @Override
    public String toString() {
        return "Vector3D(" + x + ", " + y + ", " + z + ")";
    }
}
