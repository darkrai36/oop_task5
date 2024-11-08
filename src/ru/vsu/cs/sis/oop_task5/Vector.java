package ru.vsu.cs.sis.oop_task5;

public interface Vector {
    double magnitude();
    double dotProduct(Vector other);
    Vector crossProduct(Vector other);
    double angleBetween(Vector other);
}
