package ru.vsu.cs.sis.oop_task5;

public class Main {
    public static void main(String[] args) {
        // Тестирование класса Vector2D
        Vector2D v2d1 = new Vector2D(3, 4);
        Vector2D v2d2 = new Vector2D(1, 2);

        System.out.println("2D Vector v2d1: " + v2d1);
        System.out.println("2D Vector v2d2: " + v2d2);

        // Тестирование длины вектора
        System.out.println("Magnitude of v2d1: " + v2d1.magnitude());

        // Тестирование скалярного произведения
        System.out.println("Dot product (v2d1, v2d2): " + v2d1.dotProduct(v2d2));

        // Тестирование угла между векторами
        System.out.println("Angle between v2d1 and v2d2: " + Math.toDegrees(v2d1.angleBetween(v2d2)) + " degrees");

        // Тестирование операции сложения
        Vector2D v2dSum = v2d1.add(v2d2);
        System.out.println("Sum of v2d1 and v2d2: " + v2dSum);

        // Тестирование умножения на скаляр
        Vector2D v2dScaled = v2d1.multiply(2);
        System.out.println("v2d1 scaled by 2: " + v2dScaled);

        System.out.println("\n==========================\n");

        // Тестирование класса Vector3D
        Vector3D v3d1 = new Vector3D(1, 2, 3);
        Vector3D v3d2 = new Vector3D(4, 5, 6);

        System.out.println("3D Vector v3d1: " + v3d1);
        System.out.println("3D Vector v3d2: " + v3d2);

        // Тестирование длины вектора
        System.out.println("Magnitude of v3d1: " + v3d1.magnitude());

        // Тестирование скалярного произведения
        System.out.println("Dot product (v3d1, v3d2): " + v3d1.dotProduct(v3d2));

        // Тестирование векторного произведения
        Vector3D v3dCross = (Vector3D) v3d1.crossProduct(v3d2);
        System.out.println("Cross product (v3d1, v3d2): " + v3dCross);

        // Тестирование угла между векторами
        System.out.println("Angle between v3d1 and v3d2: " + Math.toDegrees(v3d1.angleBetween(v3d2)) + " degrees");

        // Тестирование операции сложения
        Vector3D v3dSum = v3d1.add(v3d2);
        System.out.println("Sum of v3d1 and v3d2: " + v3dSum);

        // Тестирование умножения на скаляр
        Vector3D v3dScaled = v3d1.multiply(3);
        System.out.println("v3d1 scaled by 3: " + v3dScaled);
    }
}
